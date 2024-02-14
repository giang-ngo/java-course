package inheritance.lesson6;

public class MyCalculator {
    public static int add(int a, int b) {
        return a + b;
    }

    // phương thức overload với tham số là long
    public static long add(long a, long b) {
        return a + b;
    }

    // phương thức overload với tham số là double
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // sử dụng phương thức overload
        double sumDouble = add(3.25, 7.85);
        long sumLong = add(15536L, 15454L);
        int sumInt = add(1314, 578);
        //...
    }
}
