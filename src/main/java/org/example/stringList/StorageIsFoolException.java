package org.example.stringList;

public class StorageIsFoolException extends RuntimeException {
    public StorageIsFoolException() {
    }

    public StorageIsFoolException(String message) {
        super(message);
    }

    public StorageIsFoolException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFoolException(Throwable cause) {
        super(cause);
    }

    public StorageIsFoolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
