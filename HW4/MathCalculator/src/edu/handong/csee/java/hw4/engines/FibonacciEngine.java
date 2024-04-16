package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class FibonacciEngine implements Computable {
    private static final String engineName ="FIBONACCI";
    private int n;
    private double result;

    @Override
    public void setInput(String[] args) {
        if(args.length != 2){
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        n = Integer.parseInt(args[1]);
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void compute() {
        if(n < 0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        result = fibonacci(n);
    }

    private int fibonacci(int n){
        if(n <= 1){
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static String getEnginename() {
        return engineName;
    }

    public int getN() {
        return n;
    }

    @Override
    public Number getResult() {
        return Double.valueOf(result);
    }
}
