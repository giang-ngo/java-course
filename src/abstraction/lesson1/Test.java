package abstraction.lesson1;

public class Test {
    public static void main(String[] args) {
        Person nam = new Student();
        Person thanh = new Instructor();
        Person linh = new Programmer();

//        gọi phương thức
        nam.earnMoney();
        System.out.println("============================");
        thanh.earnMoney();
        System.out.println("============================");
        linh.earnMoney();

        Shape circle = new Circle();
        Shape triangle = new Triangle();
        circle.draw();
        triangle.draw();
    }
}
