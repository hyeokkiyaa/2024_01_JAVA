package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class MaxEngine implements Computable {

    private static final String engineName = "MAX";

    private double[] input;
    private double result;

    @Override
    public void setInput(String[] args) {
        if (args.length < 3) { // 엔진 이름과 최소 1개의 숫자값을 받아야 함
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        }
        input = new double[args.length - 1];
        for (int i = 1; i < args.length; i++) { // args[0]은 엔진 이름이므로 i를 1부터 시작
            input[i - 1] = Double.parseDouble(args[i]); // input 배열에 값 저장
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
            if (input[i] > result) {
                result = input[i];
            }
        }
    }

    public static String getEngineName() {
        return engineName;
    }

    public double[] getInput() {
        return input;
    }

    @Override
    public Number getResult() {
        return Double.valueOf(result); // double 값인 result를 반환합니다.
    }

}
