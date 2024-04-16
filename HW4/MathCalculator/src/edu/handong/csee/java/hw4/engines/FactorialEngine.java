package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class FactorialEngine implements Computable {
    private static final String engineName = "FACTORIAL";
    private int n;
    private double result;

    @Override
    public void setInput(String[] args) {
        if (args.length != 1) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        n = Integer.parseInt(args[0]);
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void compute() {
        if (n < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        if (n == 0 || n == 1) {
            result = 0;
        } else {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
        }
    }

    public static String getEngineName() {
        return engineName;
    }

    public int getN() {
        return n;
    }

    @Override
    public double getResult() {
        return result;
    }
}
