package learnMVC.net.model;

public class Operator {
    private double first;
    private double second;
    private double result;
    private ArithmeticException error;

    public Operator() {
    }

    public Operator(double first, double second, double result, ArithmeticException error) {
        this.first = first;
        this.second = second;
        this.result = result;
        this.error = error;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public ArithmeticException getError() {
        return error;
    }

    public void setError(ArithmeticException error) {
        this.error = error;
    }
}
