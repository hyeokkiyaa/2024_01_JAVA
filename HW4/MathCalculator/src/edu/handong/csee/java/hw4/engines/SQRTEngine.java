package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class SQRTEngine implements Computable {
    private static final String engineName ="SQRT";
    private double input;
    private double result;

    @Override
    public void setInput(String[] args) {
        if(args.length!=2){
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        input = Double.parseDouble(args[1]);
        if(input <0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void compute() {
        result = Math.sqrt(input);
    }

    public static String getEnginename() {
        return engineName;
    }

    public double getInput() {
        return input;
    }

    @Override
    public Number getResult() {
        return Double.valueOf(result);
    }
}
