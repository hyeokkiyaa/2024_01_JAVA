package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.exceptions.*;

/**
 * The SQRTEngine class calculates the square root of a non-negative double.
 * This class implements the Computable interface.
 */
public class SQRTEngine implements Computable {

    /** The name of the engine. */
    private static final String ENGINE_NAME = "SQRT";

    /** The input value for computing the square root. */
    private double input;

    /** The result of the square root computation. */
    private double result;

    /**
     * Sets the input value required for computing the square root.
     * 
     * @param args An array of String arguments containing the double value.
     */
    @Override
    public void setInput(String[] args) {
        try {
            if (args.length != 2) {
                throw new OneInputException(ENGINE_NAME);
            }
            String value = args[1];
            for (int i = 0; i < value.length(); i++) {
                if (Character.isAlphabetic(value.charAt(i))) {
                    throw new MyNumberFormatException(ENGINE_NAME, value);
                }
            }
            input = Double.parseDouble(args[1]);
            if (input < 0) {
                throw new NegativeNumberException(ENGINE_NAME);
            }
        } catch (OneInputException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (MyNumberFormatException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

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
     * 
     * @return The input value for computing the square root.
     */
    public double getInput() {
        return input;
    }

    /**
     * Returns the result of the square root computation.
     * 
     * @return The result of the square root computation.
     */
    @Override
    public double getResult() {
        return result;
    }
}
