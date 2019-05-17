package Exception;

public class CourseException extends Exception {

    public CourseException() {
        super();
    }

    public CourseException(String message) {
        super(message);
    }

    public CourseException(String message, Throwable cause) {
        super(message, cause);
    }

    public CourseException(Throwable cause) {
        super(cause);
    }

    protected CourseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
