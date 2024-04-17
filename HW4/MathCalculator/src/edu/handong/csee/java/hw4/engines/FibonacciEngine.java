package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

/**
 * The FibonacciEngine class calculates the Fibonacci sequence up to a given term.
 * This class implements the Computable interface.
 */
public class FibonacciEngine implements Computable {

    /** The name of the engine. */
    private static final String engineName = "FIBONACCI";

    /** The input value specifying the term of the Fibonacci sequence to calculate. */
    private int n;

    /** The result of the Fibonacci sequence calculation. */
    private double result;

    /**
     * Constructs a FibonacciEngine object with default values.
     * The default value for 'n' is set to 0.
     */
    public FibonacciEngine() {
    }

    /**
     * Sets the input value required for calculating the Fibonacci sequence.
     * @param args An array of String arguments containing the integer value.
     */
    @Override
    public void setInput(String[] args) {
        if (args.length != 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        n = Integer.parseInt(args[1]);
    }

    /**
     * Sets the result of the Fibonacci sequence calculation.
     * @param result The result of the Fibonacci sequence calculation.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Computes the Fibonacci sequence up to the specified term.
     */
    @Override
    public void compute() {
        if (n < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        result = fibonacci(n);
    }

    /**
     * Recursive method to calculate the Fibonacci number for a given term.
     * @param n The term of the Fibonacci sequence.
     * @return The Fibonacci number for the given term.
     */
    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Returns the name of the engine.
     * @return The name of the engine.
     */
    public static String getEngineName() {
        return engineName;
    }

    /**
     * Returns the input value specifying the term of the Fibonacci sequence.
     * @return The input value specifying the term of the Fibonacci sequence.
     */
    public int getN() {
        return n;
    }

    /**
     * Returns the result of the Fibonacci sequence calculation.
     * @return The result of the Fibonacci sequence calculation.
     */
    @Override
    public Number getResult() {
        return Double.valueOf(result);
    }
}
