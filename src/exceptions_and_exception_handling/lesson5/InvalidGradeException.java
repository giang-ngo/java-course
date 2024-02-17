package exceptions_and_exception_handling.lesson5;

public class InvalidGradeException extends RuntimeException {
    private float invalidGrade;

    public InvalidGradeException() {
    }

    public InvalidGradeException(String message, float invalidGrade) {
        super(message);
        this.invalidGrade = invalidGrade;
    }

    public float getInvalidGrade() {
        return invalidGrade;
    }
}
