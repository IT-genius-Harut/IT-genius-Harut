package intro_java.class_14_practice.exceptions;

public class DuplicateStudentAdditionException extends Exception {
    public DuplicateStudentAdditionException(String message) {
        super(message);
    }

    public DuplicateStudentAdditionException(String message, Throwable cause) {
        super(message, cause);
    }
}
