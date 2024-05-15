package edu.handong.csee.java.hw6.exceptions;

/**
 * Exception thrown when there are not enough input values provided for a function.
 */
public class MinimumInputNumberException extends Exception {

    /**
     * Default constructor with a generic exception message.
     */
    public MinimumInputNumberException() {
        super("Exception-02: You need at least 2 input values.");
    }

    /**
     * Constructor that specifies the function name and provides a detailed message.
     * 
     * @param function The function name for which the input values are insufficient.
     */
    public MinimumInputNumberException(String function) {
        super("Exception-02: You need at least 2 input values for "+function+".");
    }

}
