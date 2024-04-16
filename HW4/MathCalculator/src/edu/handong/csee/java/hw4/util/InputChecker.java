package edu.handong.csee.java.hw4.util;

/**
 * A utility class for checking inputs and printing error messages.
 */
public class InputChecker {

    /**
     * This is the constructor for InputChecker
     */
    public InputChecker(){

    }

    /**
     * Prints an error message indicating the required number of inputs and exits the program.
     * 
     * @param engineName The name of the engine for which inputs are required.
     * @param numOfRequiredInputs The number of inputs required for the specified engine.
     */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    /**
     * Prints an error message indicating the minimum required number of inputs and exits the program.
     * 
     * @param engineName The name of the engine for which inputs are required.
     * @param numOfMinimumRequiredInputs The minimum number of inputs required for the specified engine.
     */
    public static void printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(String engineName, int numOfMinimumRequiredInputs) {
        System.out.println("You need at least " + numOfMinimumRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    /**
     * Prints an error message indicating that input values cannot be negative and exits the program.
     * 
     * @param engineName The name of the engine for which negative inputs were provided.
     */
    public static void printErrorMesssageForNegativeInputsAndExit(String engineName) {
        System.out.println("Input values for " + engineName.toUpperCase() + " cannot be negative.");
        System.exit(0);
    }
}
