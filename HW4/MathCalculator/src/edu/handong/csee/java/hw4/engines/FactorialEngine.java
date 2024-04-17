package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

/**
 * The FactorialEngine class calculates the factorial of a non-negative integer.
 * This class implements the Computable interface.
 */
public class FactorialEngine implements Computable {
    /**
     * This is the constructor of FactorialEngine
     */
    public FactorialEngine(){

    }

    /** The name of the engine. */
    private static final String engineName = "FACTORIAL";

    /** The input value for computing factorial. */
    private int n;

    /** The result of the factorial computation. */
    private double result;

    /**
     * Sets the input value required for computing factorial.
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
     * Sets the result of the factorial computation.
     * @param result The result of the factorial computation.
     */
    public void setResult(double result) {
        this.result = result;
    }
    /**
     * This is setter for n input
     * @param n this is variable of input
     */
    public void setN(int n){
        this.n = n;
    }

    /**
     * Computes the factorial of the input value.
     */
    @Override
    public void compute() {
        if (n < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        result = 1; // Initialize result to 1
        for (int i = 2; i <= n; i++) { // Multiply numbers from 2 to n
            result *= i;
        }
    }


    /**
     * Returns the input value for computing factorial.
     * @return The input value for computing factorial.
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
     * Returns the result of the factorial computation.
     * @return The result of the factorial computation.
     */
    @Override
    public Number getResult() {
        return Double.valueOf(result);
    }
}

