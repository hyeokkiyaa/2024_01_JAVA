package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class LCMEngine implements Computable{
    private static final String engineName ="LCM";
    private int[] input;
    private int result;

    @Override
    public void setInput(String[] args) {
        if(args.length<3){
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        }
        input = new int[args.length-1];
        for(int i=1;i<args.length;i++){
            input[i-1] = Integer.parseInt(args[i]);
        }
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void compute() {
        result = calculateLCM(input);
    }

    private static int calculateGCD(int num1,int num2){
        while(num2!=0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }

    public static int calculateLCM(int[] numbers){
        if(numbers[0]<0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        int lcm = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<0){
                InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
            }
            lcm = (lcm * numbers[i]) / calculateGCD(lcm,numbers[i]);
        }
        return lcm;
    }

    public static String getEnginename() {
        return engineName;
    }

    public int[] getInput() {
        return input;
    }

    @Override
    public Number getResult() {
        return Integer.valueOf(result);
    }
}
