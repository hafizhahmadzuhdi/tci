package Exception;

public class EnddateEarlierException extends Exception {

    public EnddateEarlierException() {
        super();
    }

    public EnddateEarlierException(String message) {
        super(message);
    }

    public EnddateEarlierException(String message, Throwable cause) {
        super(message, cause);
    }

    public EnddateEarlierException(Throwable cause) {
        super(cause);
    }

    protected EnddateEarlierException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
