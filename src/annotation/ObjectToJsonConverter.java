package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ObjectToJsonConverter {
    private void checkIfSerializable(Object obj) {
        if (Objects.isNull(obj)) {
            throw new JsonSerializationException("The object to serialize is null" );
        }
        Class<?> c = obj.getClass();
        if (!c.isAnnotationPresent(JsonSerializable.class)) {
            throw new JsonSerializationException("The class " +
                    c.getSimpleName() + " is not annotated with JsonSerializable" );
        }
    }

    private void initializeObject(Object object) throws Exception {
        Class<?> c = object.getClass();
        for (Method method : c.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Init.class)) {
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }

    private String getKey(Field field) {
        String value = field.getAnnotation(JsonElement.class).key();
        return value.isEmpty() ? field.getName() : value;
    }

    private String getJsonString(Object object) throws Exception {
        Class<?> c = object.getClass();
        Map<String, String> jsonElementMap = new HashMap<>();
        for (Field field : c.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                jsonElementMap.put(getKey(field), field.get(object) + "" );
            }
        }
        String jsonString = jsonElementMap.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" +
                        entry.getValue() + "\"" )
                .collect(Collectors.joining("," ));
        return "{" + jsonString + "}";
    }

    public String convertToJson(Object object) throws JsonSerializationException {
        try {
            checkIfSerializable(object);
            initializeObject(object);
            return getJsonString(object);
        } catch (Exception e) {
            throw new JsonSerializationException(e.getMessage());
        }
    }
}
