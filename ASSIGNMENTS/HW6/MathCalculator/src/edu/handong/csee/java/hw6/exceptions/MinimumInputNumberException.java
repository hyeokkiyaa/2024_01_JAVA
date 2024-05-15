package edu.handong.csee.java.hw6.exceptions;

/**
 * Exception thrown when there are not enough input values provided for a function.
 */
public class MinimumInputNumberException extends Exception {

    /**
     * Default constructor with a generic exception message.
     */
    public MinimumInputNumberException() {
        super("Exception-02: Insufficient input values provided.");
    }

    /**
     * Constructor that specifies the function name and provides a detailed message.
     * 
     * @param function The function name for which the input values are insufficient.
     */
    public MinimumInputNumberException(String function) {
        super(buildErrorMessage(function));
    }

    /**
     * Builds a detailed error message based on the function name.
     * 
     * @param function The function name for which the input values are insufficient.
     * @return A detailed error message.
     */
    private static String buildErrorMessage(String function) {
        StringBuilder input = new StringBuilder("Exception-02: You need at least ");
        
        switch (function) {
            case "LCM":
            case "GCD":
            case "MAX":
            case "MIN":
                input.append("2 input values for ").append(function).append(".");
                break;
            case "FACTORIAL":
            case "SQRT":
            case "FIBONACCI":
            case "CUBEVOL":
            case "SPHEREVOL":
                input.append("1 input value for ").append(function).append(".");
                break;
        }
        
        return input.toString();
    }
}
