package edu.handong.csee.java.hw4.engines;


import edu.handong.csee.java.hw4.util.InputChecker;

/**
 * The MinEngine class calculates the minimum value among multiple doubles.
 * This class implements the Computable interface.
 */
public class MinEngine implements Computable {

    /** This is the constructor for MinEngine */
    public MinEngine(){

    }
    /** The name of the engine. */
    private static final String engineName = "MIN";

    /** The input array containing the doubles to find the minimum value. */
    private double[] input;

    /** The result of the minimum value computation. */
    private double result;

    /**
     * Sets the input values required for finding the minimum value.
     * @param args An array of String arguments containing double values.
     */
    @Override
    public void setInput(String[] args) {
        if (args.length < 3) { // The engine name and at least one number value should be received.
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        }
        input = new double[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            input[i - 1] = Double.parseDouble(args[i]);
        }
    }

    /**
     * Sets the result of the minimum value computation.
     * @param result The result of the minimum value computation.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Computes the minimum value among the input doubles.
     */
    @Override
    public void compute() {
        result = input[0];
        if (result < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        for (int i = 1; i < input.length; i++) {
            if (input[i] < 0) {
                InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
            }
            if (input[i] < result) {
                result = input[i];
            }
        }
    }

    /**
     * Returns the input array containing the doubles.
     * @return The input array containing the doubles.
     */
    public double[] getInput() {
        return input;
    }

    /**
     * Returns the result of the minimum value computation.
     * @return The result of the minimum value computation.
     */
    @Override
    public Number getResult() {
        return Double.valueOf(result);
    }
}
