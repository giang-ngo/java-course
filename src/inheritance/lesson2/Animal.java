package inheritance.lesson2;

public class Animal {
    private String name;
    private float weight;

    public Animal() {
    }

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public void move() {
        System.out.println(name + " đang di chuyển...");
    }

    public void eat() {
        System.out.println(name + " đang ăn...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}

class Cat extends Animal {
    private String color;
    private String favoriteFood;

    public Cat() {
        super();
    }

    public Cat(String name, float weight, String color, String favoriteFood) {
        super(name, weight);
        this.color = color;
        this.favoriteFood = favoriteFood;
    }

    public void catchMouse() {
        System.out.println(getName() + " đang rình bắt chuột...");
    }

    public void washFace() {
        System.out.println(getName() + " đang rửa mặt...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}