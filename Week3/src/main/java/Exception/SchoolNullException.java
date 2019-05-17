package Exception;

public class SchoolNullException extends Exception {

    public SchoolNullException() {
        super();
    }

    public SchoolNullException(String message) {
        super(message);
    }

    public SchoolNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchoolNullException(Throwable cause) {
        super(cause);
    }

    protected SchoolNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
