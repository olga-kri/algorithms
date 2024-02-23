public class MemoryIsFullException extends RuntimeException {
    public MemoryIsFullException() {
    }

    public MemoryIsFullException(String message) {
        super(message);
    }

    public MemoryIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemoryIsFullException(Throwable cause) {
        super(cause);
    }

    public MemoryIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
