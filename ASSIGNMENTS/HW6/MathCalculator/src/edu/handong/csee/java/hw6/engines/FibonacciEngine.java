package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.exceptions.*;

/**
 * The FibonacciEngine class calculates the Fibonacci sequence up to a given term.
 * This class implements the Computable interface.
 */
public class FibonacciEngine implements Computable {
    /** The name of the engine. */
    private static final String ENGINE_NAME = "FIBONACCI";

    /** The input value specifying the term of the Fibonacci sequence to calculate. */
    private int n;

    /** The result of the Fibonacci sequence calculation. */
    private double result;

    /**
     * Sets the input value required for calculating the Fibonacci sequence.
     * @param args An array of String arguments containing the integer value.
     */
    @Override
    public void setInput(String[] args) {
        try {
            if (args.length != 2) {
                throw new OneInputException(ENGINE_NAME);
            }
            n = Integer.parseInt(args[1]);
        } catch (OneInputException e) {
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * Computes the Fibonacci sequence up to the specified term.
     */
    @Override
    public void compute() {
        try {
            if (n < 0) {
                throw new NegativeNumberException(ENGINE_NAME);
            }
            result = fibonacci(n);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
        
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
     * Returns the input value specifying the term of the Fibonacci sequence.
     * @return The input value specifying the term of the Fibonacci sequence.
     */
    public int getN() {
        return n;
    }

    /**
     * This is getter for input
     * @return  var of n
     */
    public int getInput(){
        return n;
    }

    /**
     * Returns the result of the Fibonacci sequence calculation.
     * @return The result of the Fibonacci sequence calculation.
     */
    @Override
    public double getResult() {
        return result;
    }
}
