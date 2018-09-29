package com.baostorm.baocms.base.exception;

/**
 * @author BaoStorm
 */
public class ImportException extends RuntimeException {
    private static final long serialVersionUID = 4246550555922771175L;
    /**
     * Instantiates a new Import exception.
     *
     * @param message the message
     */
    public ImportException(String message) {
        super(message);
    }
}
