package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class FactorialEngine implements Computable {
    private static final String engineName = "FACTORIAL";
    private int n;
    private double result;

    @Override
    public void setInput(String[] args) {
        if (args.length != 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        n = Integer.parseInt(args[1]);
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void compute() {
        if (n < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        result = 1; // 결과를 1로 초기화
        for (int i = 2; i <= n; i++) { // 2부터 n까지 숫자를 곱함
            result *= i;
        }
    }

    public static String getEngineName() {
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
