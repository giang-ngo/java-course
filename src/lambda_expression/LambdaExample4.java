package lambda_expression;

interface Operator {
    double operator(double a, double b);
}

public class LambdaExample4 {
    public static void main(String[] args) {
        Operator addition = (a, b) -> a + b;
        System.out.println("10 + 20 = " + addition.operator(10, 20));

        Operator subtraction = (a, b) -> {
            return a - b;
        };
        System.out.println("10 - 20 = " + subtraction.operator(10, 20));

    }
}