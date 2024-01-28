package abstraction.Lesson3;

public interface Interface {
    default void show(String msg) {
        System.out.println("Gọi show() của Interface1: " + msg);
    }
}

interface Interface2 {
    default void show(String msg) {
        System.out.println("Gọi show() của Interface2: " + msg);
    }
}

class Example implements Interface, Interface2 {
    public static void main(String[] args) {
        Example example = new Example();
        var msg = "I'm a developer";
        example.show(msg);
    }


    @Override
    public void show(String msg) {
        Interface.super.show(msg);
        Interface2.super.show(msg);
        System.out.println("Gọi show() của Example: " + msg);
    }
}