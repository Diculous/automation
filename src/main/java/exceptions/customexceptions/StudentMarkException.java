package exceptions.customexceptions;

public class StudentMarkException extends Exception{
    public StudentMarkException() {
        super();
    }

    public StudentMarkException(String message) {
        super(message);
    }

    public StudentMarkException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentMarkException(Throwable cause) {
        super(cause);
    }
}
