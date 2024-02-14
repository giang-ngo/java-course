package abstraction.lesson1;

public abstract class Shape {
    public abstract void draw();
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Vẽ hình tam giác");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }
}
