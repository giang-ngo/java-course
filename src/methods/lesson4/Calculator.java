package methods.lesson4;

public class Calculator {
    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static int add(int... numbers) {
        int sum = 0;
        for (var item : numbers) {
            sum += item;
        }
        return sum;
    }
}
