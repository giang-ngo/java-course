package learnMVC.net.controller;

import learnMVC.net.model.Operator;

public interface CalculatorController {
    Operator add(double a, double b);

    Operator sub(double a, double b);

    Operator mul(double a, double b);

    Operator div(double a, double b);

    Operator mod(double a, double b);
}
