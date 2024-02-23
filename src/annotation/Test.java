package annotation;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("EMP1001",
                "vy", "nguyen",
                "vycute@xmail.com", "Ho Chi Minh", 15.5f);
        var converter = new ObjectToJsonConverter();
        var result = converter.convertToJson(employee);
        System.out.println(result);

    }
}
