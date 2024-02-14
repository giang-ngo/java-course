package abstraction.lesson2;


public class Test {
    public static void main(String[] args) {
        Drawable shape = new Shape(200, 200);
        Movable movable = new Shape(500, 500);

//        Drawable d = new Drawable();error

        movable.down();
        movable.up();
        movable.left();
        movable.right();


        Shape x = (Shape) movable;
        Shape y = (Shape) shape;

        System.out.println("Tọa độ trước khi vẽ: " + shape);
        shape.draw();
        System.out.println("Sau khi vẽ: " + shape);
    }
}
