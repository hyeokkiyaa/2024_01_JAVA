package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

/**
 * The SQRTEngine class calculates the square root of a non-negative double.
 * This class implements the Computable interface.
 */
public class SQRTEngine implements Computable {

    /** This is the constructor for SQRTEngine */
    public SQRTEngine(){
        
    }

    /** The name of the engine. */
    private static final String engineName = "SQRT";

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
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        input = Double.parseDouble(args[1]);
        if (input < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
    }

    /**
     * Sets the result of the square root computation.
     * @param result The result of the square root computation.
     */
    public void setResult(double result) {
        this.result = result;
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
    public Number getResult() {
        return Double.valueOf(result);
    }
}
