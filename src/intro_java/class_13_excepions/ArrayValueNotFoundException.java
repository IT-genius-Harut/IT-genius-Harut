package intro_java.class_13_excepions;

public class ArrayValueNotFoundException extends RuntimeException {
    public ArrayValueNotFoundException(String message) {
        super(message);
    }

    public ArrayValueNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public void log() {
        System.out.println("an exception was thrown with message: " + getMessage());
    }
}