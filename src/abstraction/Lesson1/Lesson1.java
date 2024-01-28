package abstraction.Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        Person name = new Student();
        Person thanh = new Instructor();
        Person linh = new Programmer();

//        gọi phương thức
        name.earnMoney();
        System.out.println("================================");
        thanh.earnMoney();
        System.out.println("================================");
        linh.earnMoney();
        System.out.println("================================");

        Shape circle = new Circle();
        Shape triangle = new Triangle();
        //        gọi phương thức
        circle.draw();
        triangle.draw();
    }
}

