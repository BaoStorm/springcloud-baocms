package com.baostorm.baocms.base.exception;

/**
 * @author BaoStorm
 */
public class ConfigException extends RuntimeException {

    private static final long serialVersionUID = -8846505049646591157L;

    /**
     * Instantiates a new Config exception.
     *
     * @param message the message
     */
    public ConfigException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Config exception.
     */
    public ConfigException() {

    }
}
