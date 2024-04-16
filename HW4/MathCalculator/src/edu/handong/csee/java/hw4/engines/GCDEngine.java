package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class GCDEngine implements Computable {
    private static final String engineName ="GCD";
    private int[] input;
    private int result;

    @Override
    public void setInput(String[] args) {
        if(args.length<2){
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        }
        input = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            input[i] = Integer.parseInt(args[i]);
        }
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void compute() {
        result = calculateGCD(input);
    }

    private static int calculateGCD(int[] input){
        int answer = input[0];
        for(int i=1;i<input.length;i++){
            if(input[i]<0){
                InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
            }
            answer = calculateGCD(answer,input[i]);
        }
        return answer;
    }

    private static int calculateGCD(int num1, int num2){
        while (num2!=0){
            int temp = num2;
            num2 = num1%num2;
            num1=temp;
        }
        return num1;
    }

    public static String getEnginename() {
        return engineName;
    }
    public int[] getInput() {
        return input;
    }

    public Number getResult() {
        return result;
    }
    
}
