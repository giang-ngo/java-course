package inheritance.lesson6;

public class Test {
    public static void main(String[] args) {
        Animal fish = new Fish();
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal animal = new Animal();

        animal.move();
        bird.move();
        cat.move();
        fish.move();
    }
}
