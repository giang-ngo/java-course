package polymorphism.lesson2;

public class Test {
    public static void main(String[] args) {
        Animal fish = new Fish();
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal animal = new Animal();

        animal.move();
        fish.move();
        cat.move();
        bird.move();
    }
}
