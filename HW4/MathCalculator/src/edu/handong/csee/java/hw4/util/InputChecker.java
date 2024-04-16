package edu.handong.csee.java.hw4.util;

public class InputChecker {

    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    public static void printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(String engineName, int numOfMinimumRequiredInputs) {
        System.out.println("You need at least " + numOfMinimumRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    public static void printErrorMesssageForNegativeInputsAndExit(String engineName) {
        System.out.println("Input values for " + engineName.toUpperCase() + " cannot be negative.");
        System.exit(0);
    }
}
