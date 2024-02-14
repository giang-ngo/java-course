package inheritance.lesson6;

public class Animal {
    public void move() {
        System.out.println("Animal is is moving...");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Fish is moving by swimming...");
    }
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("Cat is moving by running on the ground...");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird is moving by flying...");
    }
}