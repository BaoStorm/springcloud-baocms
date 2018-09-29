package com.baostorm.baocms.base.exception;


/**
 * @author BaoStorm
 */
public class ReferenceModelNullException extends RuntimeException {
    private static final long serialVersionUID = 808862087818699723L;
    /**
     * Instantiates a new Reference model null exception.
     *
     * @param message the message
     */
    public ReferenceModelNullException(String message) {
        super(message);
    }
}
