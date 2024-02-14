package polymorphism.lesson3;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Vinfast", "President", 2250);
//        System.out.println(car.getClass().getName());
        System.out.println(car);
        System.out.println("======================================");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S",
                2325, 120, 900000);

//        System.out.println(electricCar.getClass());
        System.out.println(electricCar);
    }
}
