package polymorphism.lesson3;

public class Car {
    private String brand;
    private String name;
    private float weight;

    public Car() {
    }

    public Car(String brand, String name, float weight) {
        this.brand = brand;
        this.name = name;
        this.weight = weight;
    }

    public void speedUp() {
        //...
    }

    public void brake() {
        //...
    }

//    @Override
//    public String toString() {
//        return getClass().getName() + "Car[" +
//                "brand='" + brand + '\'' +
//                ", name='" + name + '\'' +
//                ", weight=" + weight +
//                ']';
//    }

    //    @Override
//    public String toString() {
//        return getClass().getName() + "[" +
//                "brand='" + brand + '\'' +
//                ", name='" + name + '\'' +
//                ", weight=" + weight +
//                ']';
//    }
}

class ElectricCar extends Car {
    private float voltage; // hiệu điện thế
    private float bateryCapacity; // dung lượng pin

    public ElectricCar(float voltage, float bateryCapacity) {
        this.voltage = voltage;
        this.bateryCapacity = bateryCapacity;
    }

    public ElectricCar(String brand, String name, float weight,
                       float voltage, float bateryCapacity) {
        super(brand, name, weight);
        this.voltage = voltage;
        this.bateryCapacity = bateryCapacity;
    }

    //...


    @Override
    public String toString() {
        return super.toString() + "[" +
                "voltage=" + voltage +
                ", bateryCapacity=" + bateryCapacity +
                ']';
    }
}
