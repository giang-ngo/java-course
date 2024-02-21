package generic_collection.lesson2;

public class Test {
    public static void main(String[] args) {
        MyMap<Integer, String> mapOne = new MyMap<>(1, "One");
        System.out.println("Key: " + mapOne.getKey() + " - Value: "
                + mapOne.getValue());

        MyMap<String, String> hello = new MyMap<>("Hello", "Xin Chào");
        System.out.println("Key: " + hello.getKey() +
                " - Value: " + hello.getValue());

    }
}
