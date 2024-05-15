package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.exceptions.*;

/**
 * The CubeVolEngine class calculates the volume of a cube based on the length of its side.
 * This class implements the Computable interface.
 */
public class CubeVolEngine implements Computable {
    /** The name of the engine. */
    private static final String ENGINE_NAME = "CUBEVOL";

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
        try {
            if (args.length != 2) {
                throw new OneInputException(ENGINE_NAME);
            }
            sideLength = Double.parseDouble(args[1]);
        } catch (OneInputException e) {
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * Computes the volume of the cube.
     */
    @Override
    public void compute() {
        try {
            if (sideLength < 0) {
                throw new NegativeNumberException(ENGINE_NAME);
            }
            volume = sideLength * sideLength * sideLength;
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * Returns the calculated volume of the cube.
     * @return The volume of the cube.
     */
    public double getVolume() {
        return volume;
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
    public double getResult() {
        return volume;
    }
}
