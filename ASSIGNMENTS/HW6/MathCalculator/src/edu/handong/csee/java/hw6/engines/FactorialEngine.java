package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.exceptions.*;

/**
 * The FactorialEngine class calculates the factorial of a non-negative integer.
 * This class implements the Computable interface.
 */
public class FactorialEngine implements Computable {
    /** The name of the engine. */
    private static final String ENGINE_NAME = "FACTORIAL";

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
        try{
            if (args.length != 2) {
                throw new OneInputException(ENGINE_NAME);
            }
            n = Integer.parseInt(args[1]);
        } catch (OneInputException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
    }

    /**
     * Computes the factorial of the input value.
     */
    @Override
    public void compute() {
        try{
            if (n < 0) {
                throw new NegativeNumberException(ENGINE_NAME);
            }
            result = 1; // Initialize result to 1
            for (int i = 2; i <= n; i++) { // Multiply numbers from 2 to n
                result *= i;
            }
        } catch (NegativeNumberException e){
            System.out.println(e.getMessage());
            System.exit(0);
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
    public double getResult() {
        return result;
    }
}