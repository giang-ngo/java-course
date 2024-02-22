package pratice_regex.example2;

public class InvalidEmpIdException extends Exception {
    private String invalidId;

    public InvalidEmpIdException() {
    }

    public InvalidEmpIdException(String invalidId) {
        this.invalidId = invalidId;
    }

    public InvalidEmpIdException(String message, String invalidId) {
        super(message);
        this.invalidId = invalidId;
    }

    public String getInvalidId() {
        return invalidId;
    }
}
