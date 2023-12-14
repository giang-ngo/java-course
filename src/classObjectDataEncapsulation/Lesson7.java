package classObjectDataEncapsulation;

public class Lesson7 {
    private int id;
    private String name;
    public static int nextId = 100;

    class Address {
        public void doSomeThing() {
            nextId++;
//            Lesson7.eatSomeThing();
            eatSomeThing();
        }
    }

    public static void eatSomeThing() {

    }
}
