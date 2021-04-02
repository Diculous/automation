package exceptions.customexceptions;

public class StudentNullSubjectsException extends NullPointerException{
    public StudentNullSubjectsException() {
        super();
    }

    public StudentNullSubjectsException(String s) {
        super(s);
    }
}
