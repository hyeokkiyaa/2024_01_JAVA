package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

/**
 * The MinEngine class calculates the minimum value among multiple doubles.
 * This class implements the Computable interface.
 */
public class MinEngine implements Computable {

    /** The name of the engine. */
    private static final String ENGINE_NAME = "MIN";

    /** The input array containing the doubles to find the minimum value. */
    private double[] input;

    /** The result of the minimum value computation. */
    private double result;

    /**
     * Sets the input values required for finding the minimum value.
     * 
     * @param args An array of String arguments containing double values.
     */
    @Override
    public void setInput(String[] args) {
        if (args.length < 3) { // The engine name and at least one number value should be received.
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(ENGINE_NAME, 2);
        }
        input = new double[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            input[i - 1] = Double.parseDouble(args[i]);
        }
    }

    /**
     * Computes the minimum value among the input doubles.
     */
    @Override
    public void compute() {
        result = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < result) {
                result = input[i];
            }
        }
    }

    /**
     * Returns the input array containing the doubles.
     * 
     * @return The input array containing the doubles.
     */
    public double[] getInput() {
        return input;
    }

    /**
     * Returns the result of the minimum value computation.
     * 
     * @return The result of the minimum value computation.
     */
    @Override
    public double getResult() {
        return result;
    }
}
