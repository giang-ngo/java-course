package learnMVC.net.controller;

import learnMVC.net.model.Operator;

public class CalculatorControllerImp implements CalculatorController {

    @Override
    public Operator add(double a, double b) {
        return new Operator(a, b, a + b, null);
    }

    @Override
    public Operator sub(double a, double b) {
        return new Operator(a, b, a - b, null);
    }

    @Override
    public Operator mul(double a, double b) {
        return new Operator(a, b, a * b, null);
    }

    @Override
    public Operator div(double a, double b) {
        if (b == 0) {
            return new Operator(a, b, 0,
                    new ArithmeticException("Divide by zero exception"));
        }
        return new Operator(a, b, a / b, null);
    }

    @Override
    public Operator mod(double a, double b) {
        if (b == 0) {
            return new Operator(a, b, 0,
                    new ArithmeticException("Divide by zero exception"));
        }
        return new Operator(a, b, a % b, null);
    }
}
