package inheritance.lesson7;

public class Test {
    public static void main(String[] args) {
        Object car = new Car("Vinfast", "President", 2250);
//        System.out.println(car.getClass().getName());
        System.out.println(car);


        ElectricCar electricCar = new ElectricCar("Tesla", "Model S",
                2325, 120, 9000000);
//        System.out.println(electricCar.getClass().getName());

        System.out.println(electricCar);
    }
}
