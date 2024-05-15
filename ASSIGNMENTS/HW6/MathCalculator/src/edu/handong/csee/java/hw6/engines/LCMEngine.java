package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.exceptions.*;

/**
 * The LCMEngine class calculates the least common multiple (LCM) of multiple
 * integers. This class implements the Computable interface.
 */
public class LCMEngine implements Computable {
    /** The name of the engine. */
    private static final String ENGINE_NAME = "LCM";

    /** The input array containing the integers to compute the LCM. */
    private int[] input;

    /** The result of the LCM computation. */
    private int result;

    /**
     * Sets the input values required for calculating the LCM.
     * 
     * @param args An array of String arguments containing integer values.
     */
    @Override
    public void setInput(String[] args) {
        try{
            if (args.length < 3) {
                throw new MinimumInputNumberException(ENGINE_NAME);
            }
            input = new int[args.length - 1];
            for (int i = 1; i < args.length; i++) {
                input[i - 1] = Integer.parseInt(args[i]);
                if(input[i-1]<0){
                    throw new NegativeNumberException(ENGINE_NAME);
                }
            }
        } catch(MinimumInputNumberException e){
            System.out.println(e.getMessage());
            System.exit(0);
        } catch(NegativeNumberException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        
    }

    /**
     * Computes the LCM of the input integers.
     */
    @Override
    public void compute() {
        if (input.length == 0) {
            result = 1; // LCM of an empty set of numbers is 1
        } else if (input.length == 1) {
            result = input[0]; // LCM of a single number is the number itself
        } else {
            result = calculateLCM(input);
        }
    }

    /**
     * Calculates the LCM of multiple integers.
     * 
     * @param numbers An array of integers.
     * @return The LCM of the input integers.
     */
    private static int calculateLCM(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = calculateLCM(lcm, numbers[i]);
        }
        return lcm;
    }

    /**
     * Sets the result of the LCM computation.
     * @param result The result of the LCM computation.
     */
    public void setResult(int result) {
        this.result = result;
    }


    /**
     * Calculates the LCM of two integers.
     * 
     * @param a The first integer.
     * @param b The second integer.
     * @return The LCM of the two integers.
     */
    private static int calculateLCM(int a, int b) {
        return Math.abs(a * b) / calculateGCD(a, b);
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers.
     * 
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The GCD of the two integers.
     */
    private static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }


    /**
     * Returns the input array containing the integers.
     * 
     * @return The input array containing the integers.
     */
    public int[] getInput() {
        return input;
    }

    

    /**
     * Returns the result of the LCM computation.
     * 
     * @return The result of the LCM computation.
     */
    @Override
    public double getResult() {
        return result;
    }
}
