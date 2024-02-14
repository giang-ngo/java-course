package inheritance.lesson2;


public class Lesson2 {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom", 2.5f, "Black", "Fish");
        cat.eat();
        cat.move();

        Animal fish = new Fish();
        Animal animal = new Animal();

        if (cat instanceof Cat) {
            Cat tom = (Cat) cat;
            tom.washFace();
            tom.catchMouse();
            tom.eat();
            tom.move();
        }

        if (fish instanceof Fish) {
            Fish newFish = (Fish) fish;
            System.out.println("Ép sang đối tượng Fish thành công");
        }
        if (animal instanceof Cat) {
            Cat tom = (Cat) animal;
            System.out.println("Ép sang đối tượng Cat thành công");
        }

    }
}
