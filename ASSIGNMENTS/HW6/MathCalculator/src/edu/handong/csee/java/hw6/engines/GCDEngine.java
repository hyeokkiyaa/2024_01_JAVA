package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.util.InputChecker;

/**
 * The GCDEngine class calculates the greatest common divisor (GCD) of multiple integers.
 * This class implements the Computable interface.
 */
public class GCDEngine implements Computable {
    /** The name of the engine. */
    private static final String ENGINE_NAME = "GCD";

    /** The input array containing the integers to compute the GCD. */
    private int[] input;

    /** The result of the GCD computation. */
    private int result;

    /**
     * Sets the input values required for calculating the GCD.
     * @param args An array of String arguments containing integer values.
     */
    @Override
    public void setInput(String[] args) {
        if (args.length < 3) {
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(ENGINE_NAME, 2);
        }
        input = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            input[i - 1] = Integer.parseInt(args[i]);
            if(input[i-1]<0){
                InputChecker.printErrorMesssageForNegativeInputsAndExit(ENGINE_NAME);
            }
        }
    }

    /**
     * Computes the GCD of the input integers.
     */
    @Override
    public void compute() {
        result = calculateGCD(input);
    }

    /**
     * Calculates the GCD of multiple integers.
     * @param input An array of integers.
     * @return The GCD of the input integers.
     */
    private static int calculateGCD(int[] input) {
        int answer = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < 0) {
                InputChecker.printErrorMesssageForNegativeInputsAndExit(ENGINE_NAME);
            }
            answer = calculateGCD(answer, input[i]);
        }
        return answer;
    }

    /**
     * Calculates the GCD of two integers using Euclid's algorithm.
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
     * @return The input array containing the integers.
     */
    public int[] getInput() {
        return input;
    }

    /**
     * Returns the result of the GCD computation.
     * @return The result of the GCD computation.
     */
    @Override
    public double getResult() {
        return result;
    }
}
