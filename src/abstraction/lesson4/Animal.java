package abstraction.lesson4;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void move(); // di chuyển

    protected abstract void eat(); // ăn

    public String getName() {
        return name;
    }
}

class AnimalExample {
    public static void main(String[] args) {
        Animal tom = new Animal("Tom") {
            @Override
            protected void move() {
                System.out.println("Mèo " + getName() +
                        " đang chạy trên nóc nhà");
            }

            @Override
            protected void eat() {
                System.out.println("Mèo " + getName() + " ăn patê");
            }
        };

        System.out.println("Tên mèo là " + tom.getName());
        tom.move();
        tom.eat();
    }
}
