package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.exceptions.*;

/**
 * The MaxEngine class calculates the maximum value among multiple doubles.
 * This class implements the Computable interface.
 */
public class MaxEngine implements Computable {

    /** The name of the engine. */
    private static final String ENGINE_NAME = "MAX";

    /** The input array containing the doubles to find the maximum value. */
    private double[] input;

    /** The result of the maximum value computation. */
    private double result;

    /**
     * Sets the input values required for finding the maximum value.
     * @param args An array of String arguments containing double values.
     */
    @Override
    public void setInput(String[] args) {
        try {
            if (args.length < 3) { // The engine name and at least one number value should be received.
                throw new MinimumInputNumberException(ENGINE_NAME);
            }
            input = new double[args.length - 1];
            for (int i = 1; i < args.length; i++) { // Start from i = 1 since args[0] is the engine name.
                input[i - 1] = Double.parseDouble(args[i]); // Store values in the input array.
            }
        } catch (MinimumInputNumberException e) {
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * Computes the maximum value among the input doubles.
     */
    @Override
    public void compute() {
        result = input[0];   
        for (int i = 1; i < input.length; i++) {         
            if (input[i] > result) {
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
     * Returns the result of the maximum value computation.
     * @return The result of the maximum value computation.
     */
    @Override
    public double getResult() {
        return result; // Return the double value of result.
    }
}
