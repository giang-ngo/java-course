package inheritance;

public class Lesson2 {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom", 2.5f, "Black", "Fish");
//        animal = cat;
        cat.move();
        cat.eat();
//        cat.washFace();
//        cat.catchMouse();

        Animal fish = new Fish();
        Animal animal = new Animal();

        if (cat instanceof Cat) {
//            Animal animal = new Cat();
            Cat tom = (Cat) cat;
            tom.washFace();
            tom.catchMouse();
            tom.move();
            tom.eat();
        }

        if (fish instanceof Fish) {
//            Animal animal = new Cat();
            Fish newFish = (Fish) fish;
            System.out.println("Ép sang đối tượng Fish thành công");
        }

        if (animal instanceof Cat) {
//            Animal animal = new Cat();
            Cat tom = (Cat) animal;
            System.out.println("Ép sang đối tượng của lớp Cat thành công");
        }

    }
}