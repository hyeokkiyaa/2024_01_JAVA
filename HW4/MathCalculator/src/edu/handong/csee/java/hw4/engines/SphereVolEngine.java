package edu.handong.csee.java.hw4.engines;

import edu.handong.csee.java.hw4.util.InputChecker;

/**
 * The SphereVolEngine class calculates the volume of a sphere based on its radius.
 * This class implements the Computable interface.
 */
public class SphereVolEngine implements Computable {

    /** The name of the engine. */
    private static final String ENGINE_NAME = "SPHEREVOL";

    /** The radius of the sphere. */
    private double radius;

    /** The result of the sphere volume computation. */
    private double result;

    /**
     * Sets the input value required for computing the volume of the sphere.
     * @param args An array of String arguments containing the radius of the sphere.
     */
    @Override
    public void setInput(String[] args) {
        if (args.length != 2) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(ENGINE_NAME, 1);
        }
        radius = Double.parseDouble(args[1]);
        if (radius < 0) {
            InputChecker.printErrorMesssageForNegativeInputsAndExit(ENGINE_NAME);
        }
    }

    /**
     * Computes the volume of the sphere.
     */
    @Override
    public void compute() {
        result = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Returns the radius of the sphere.
     * @return The radius of the sphere.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * This is getter for input
     * @return var radius
     */
    public double getInput(){
        return radius;
    }

    /**
     * Returns the result of the sphere volume computation.
     * @return The result of the sphere volume computation.
     */
    @Override
    public double getResult() {
        return result;
    }
}
