package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class SphereVolEngine implements Computable {
    private static final String engineName ="SPHEREVOL";

    private double radius;
    private double result;

    @Override
    public void setInput(String[] args) {
        if(args.length != 1){
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        radius = Double.parseDouble(args[0]);
        if(radius<0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void compute() {
        result = (4/3)*Math.PI*(radius)*(radius)*(radius);
    }

    public static String getEnginename() {
        return engineName;
    }

    public double getRadius() {
        return radius;
    }
    
    @Override
    public Number getResult() {
        return result;
    }
    
}
