package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

public class CubeVolEngine implements Computable {
    private static final String engineName = "CUBEVOL";
    private double sideLength;
    private double volume;

    @Override
    public void setInput(String[] args) {
        if (args.length != 1) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        sideLength = Double.parseDouble(args[0]);
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void compute() {
        if (sideLength < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        volume = sideLength * sideLength * sideLength;
    }

    public static String getEngineName() {
        return engineName;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getResult() {
        return volume;
    }

}
