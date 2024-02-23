public class TooFewElementsException extends RuntimeException {
    public TooFewElementsException() {
    }

    public TooFewElementsException(String message) {
        super(message);
    }

    public TooFewElementsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooFewElementsException(Throwable cause) {
        super(cause);
    }

    public TooFewElementsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
