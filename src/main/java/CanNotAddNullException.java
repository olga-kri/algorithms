public class CanNotAddNullException extends RuntimeException {
    public CanNotAddNullException() {
    }

    public CanNotAddNullException(String message) {
        super(message);
    }

    public CanNotAddNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public CanNotAddNullException(Throwable cause) {
        super(cause);
    }

    public CanNotAddNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
