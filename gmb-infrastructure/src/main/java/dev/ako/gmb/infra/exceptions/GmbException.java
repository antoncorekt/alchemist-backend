package dev.ako.gmb.infra.exceptions;

/**
 * @author Anton Kozlovskyi
 * @date 28 Jan 2020
 */
public class GmbException extends RuntimeException {

    public GmbException() {
    }

    public GmbException(String message) {
        super(message);
    }

    public GmbException(String message, Throwable cause) {
        super(message, cause);
    }

    public GmbException(Throwable cause) {
        super(cause);
    }

    public GmbException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
