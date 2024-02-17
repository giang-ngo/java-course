package learnMVC.net.view;

import learnMVC.net.controller.CalculatorControllerImp;
import learnMVC.net.model.Operator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toán hạng a: ");
        var a = scanner.nextDouble();
        System.out.println("Toán hạng b: ");
        var b = scanner.nextDouble();


        var calculator = new CalculatorControllerImp();
        var resultAddition = calculator.add(a, b);
        var resultSubtraction = calculator.sub(a, b);
        var resultMultiply = calculator.mul(a, b);
        var resultDivision = calculator.div(a, b);
        var resultMode = calculator.mod(a, b);

        showResult(resultAddition, " + ");
        showResult(resultSubtraction, " - ");
        showResult(resultMultiply, " * ");
        showResult(resultDivision, " / ");
        showResult(resultMode, " % ");
    }

    private static void showResult(Operator operator, String option) {
        if (operator.getError() == null) {
            System.out.println(operator.getFirst() + option +
                    operator.getSecond() + " = " + operator.getResult());
        } else {
            System.out.print("Error at operator:" + option + ".");
            System.out.println(operator.getError().getMessage());
        }
    }
}
