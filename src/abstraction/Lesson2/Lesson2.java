package abstraction.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        Drawable shape = new Shape(200, 200);

        Movable movable = new Shape(500, 500);

//        Drawable a = new Drawable();//không thể tạo đối tượng từ interface

        movable.up();
        movable.down();
        movable.left();
        movable.right();

        Shape x = (Shape) movable;
        Shape y = (Shape) shape;

        System.out.println("Tọa độ trước khi vẽ: " + shape);
        shape.draw();
        System.out.println("Sau khi vẽ: " + shape);
    }
}
