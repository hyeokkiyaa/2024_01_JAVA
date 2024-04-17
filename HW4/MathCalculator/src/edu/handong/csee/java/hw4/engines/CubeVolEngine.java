package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

/**
 * The CubeVolEngine class calculates the volume of a cube based on the length of its side.
 * This class implements the Computable interface.
 */
public class CubeVolEngine implements Computable {
    /**
     * This is the constructor of the CubeVolEngine
     */
    public CubeVolEngine(){

    }
    /** The name of the engine. */
    private static final String engineName = "CUBEVOL";

    /** The length of the side of the cube. */
    private double sideLength;

    /** The calculated volume of the cube. */
    private double volume;

    /**
     * Sets the input values required for computing the volume.
     * @param args An array of String arguments containing the side length of the cube.
     */
    @Override
    public void setInput(String[] args) {
        if (args.length != 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
        sideLength = Double.parseDouble(args[1]);
    }

    /**
     * Sets the volume of the cube.
     * @param volume The volume of the cube.
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Computes the volume of the cube.
     */
    @Override
    public void compute() {
        if (sideLength < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
        }
        volume = sideLength * sideLength * sideLength;
    }

    /**
     * Returns the name of the engine.
     * @return The name of the engine.
     */
    public static String getEngineName() {
        return engineName;
    }

    /**
     * Returns the length of the side of the cube.
     * @return The length of the side of the cube.
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * Returns the result of the computation, which is the volume of the cube.
     * @return The volume of the cube.
     */
    @Override
    public Number getResult() {
        return Double.valueOf(volume);
    }
}
