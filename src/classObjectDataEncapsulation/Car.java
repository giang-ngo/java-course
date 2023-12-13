package classObjectDataEncapsulation;

public class Car {
    public String name;
    public float weight;
    public int year;
    public String type;

    //    default constructor
    public Car() {
        super();
    }

    public Car(String name) {
        this.name = name;
//        Other.showInfo(this);
    }

    public Car(String name, float weight) {
        this(name);
        this.weight = weight;
    }

    public Car(String name, float weight, int year) {
        this(name, weight);
        this.year = year;
    }

    public Car(String name, float weight, int year, String type) {
        this(name, weight, year);
        this.type = type;
        Other.showInfo(this);

    }
}
