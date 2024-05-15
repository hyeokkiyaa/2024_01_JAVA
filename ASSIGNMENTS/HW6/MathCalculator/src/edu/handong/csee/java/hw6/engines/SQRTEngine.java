package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.util.InputChecker;

/**
 * The SQRTEngine class calculates the square root of a non-negative double.
 * This class implements the Computable interface.
 */
public class SQRTEngine implements Computable {

    /** The name of the engine. */
    private static final String ENGINE_NAME = "SQRT";

    /** The input value for computing the square root. */
    private double input;

    /** The result of the square root computation. */
    private double result;

    /**
     * Sets the input value required for computing the square root.
     * @param args An array of String arguments containing the double value.
     */
    @Override
    public void setInput(String[] args) {
        if (args.length != 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(ENGINE_NAME, 1);
        }
        input = Double.parseDouble(args[1]);
        if (input < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(ENGINE_NAME);
        }
    }

    /**
     * Computes the square root of the input value.
     */
    @Override
    public void compute() {
        result = Math.sqrt(input);
    }

    /**
     * Returns the input value for computing the square root.
     * @return The input value for computing the square root.
     */
    public double getInput() {
        return input;
    }

    /**
     * Returns the result of the square root computation.
     * @return The result of the square root computation.
     */
    @Override
    public double getResult() {
        return result;
    }
}
