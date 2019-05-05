package Exception;

public class ChapterException extends Exception {

    public ChapterException() {
    }

    public ChapterException(String message) {
        super(message);
    }

    public ChapterException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChapterException(Throwable cause) {
        super(cause);
    }

    public ChapterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
