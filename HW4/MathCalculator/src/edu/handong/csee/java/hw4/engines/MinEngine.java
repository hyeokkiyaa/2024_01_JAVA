package edu.handong.csee.java.hw4.engines;


import edu.handong.csee.java.hw4.util.InputChecker;

public class MinEngine implements Computable {
    private static final String engineName = "MIN";
    private double[] input;
    private double result;

    @Override
    public void setInput(String[] args) {
        if (args.length < 2) {
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        }
        input = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            input[i] = Double.parseDouble(args[i]);
        }
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void compute() {
        result = input[0];
        if (result < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        for (int i = 1; i < input.length; i++) {
            if (input[i] < 0) {
                InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
            }
            if (input[i] < result) {
                result = input[i];
            }
        }
    }

    public static String getEnginename() {
        return engineName;
    }
    public double[] getInput() {
        return input;
    }
    
    @Override
    public Number getResult() {
        return result;
    }
}