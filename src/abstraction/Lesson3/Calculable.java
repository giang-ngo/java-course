package abstraction.Lesson3;

public interface Calculable {
    int add(int a, int b); // cộng hai số

    int sub(int a, int b); // trừ hai số

    default float div(int a, int b) {// chia 2 số
        return 0;
    }

    default int mul(int a, int b) {
        return 1;
    }
}

interface OtherCalculable extends Calculable {
    @Override
    default float div(int a, int b) {
        return 1.0f * a / b;
    }

    int mul(int a, int b);//abstract method
}

/**
 * lớp Calculator implements interface trên
 */
class Calculator implements OtherCalculable {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public float div(int a, int b) {
        if (b == 0) {
            System.out.println("Mẫu số phải khác 0");
            return Float.NaN;
        }
        return a * 1.0f / b;
    }

    @Override
    public int mul(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        Calculable cal = new Calculator();
        System.out.println(a + " + " + b + " = " + cal.add(a, b));
        System.out.println(a + " - " + b + " = " + cal.sub(a, b));
        // gọi các phương thức default
        System.out.println(a + " * " + b + " = " + cal.mul(a, b));
        System.out.println(a + " / " + b + " = " + cal.div(a, b));
    }
}
