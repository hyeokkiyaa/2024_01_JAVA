package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

/**
 * The LCMEngine class calculates the least common multiple (LCM) of multiple integers.
 * This class implements the Computable interface.
 */
public class LCMEngine implements Computable {
    /**
     * This is the constructor for LCMEngine
     */
    public LCMEngine(){

    }

    /** The name of the engine. */
    private static final String engineName = "LCM";

    /** The input array containing the integers to compute the LCM. */
    private int[] input;

    /** The result of the LCM computation. */
    private int result;

    /**
     * Sets the input values required for calculating the LCM.
     * @param args An array of String arguments containing integer values.
     */
    @Override
    public void setInput(String[] args) {
        if (args.length < 3) {
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        }
        input = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            input[i - 1] = Integer.parseInt(args[i]);
        }
    }

    /**
     * Sets the result of the LCM computation.
     * @param result The result of the LCM computation.
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * Computes the LCM of the input integers.
     */
    @Override
    public void compute() {
        result = calculateLCM(input);
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers.
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
     * Calculates the LCM of multiple integers.
     * @param numbers An array of integers.
     * @return The LCM of the input integers.
     */
    public static int calculateLCM(int[] numbers) {
        if (numbers[0] < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
            }
            lcm = (lcm * numbers[i]) / calculateGCD(lcm, numbers[i]);
        }
        return lcm;
    }

    /**
     * Returns the name of the engine.
     * @return The name of the engine.
     */
    public static String getEngineName() {
        return engineName;
    }

    /**
     * Returns the input array containing the integers.
     * @return The input array containing the integers.
     */
    public int[] getInput() {
        return input;
    }

    /**
     * Returns the result of the LCM computation.
     * @return The result of the LCM computation.
     */
    @Override
    public Number getResult() {
        return Integer.valueOf(result);
    }
}
