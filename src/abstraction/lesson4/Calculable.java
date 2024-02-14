package abstraction.lesson4;

public interface Calculable {
    int add(int a, int b); // cộng hai số

    int sub(int a, int b); // trừ hai số

    default float div(int a, int b) { // chia hai so
        return 0;
    }

    default int mul(int a, int b) {
        return 1;
    }
}

class Example {
    public static void main(String[] args) {
        //tạo đối tượng từ lớp vô danh implements interface
        Calculable myCalculator = new Calculable() {
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
                return a * 1.0f / b;
            }
        };

        System.out.println(myCalculator.add(100, 200));
        System.out.println(myCalculator.sub(100, 200));
        System.out.println(myCalculator.div(100, 200));

    }
}
