package edu.handong.csee.java.hw6.engines;

import edu.handong.csee.java.hw6.exceptions.NegativeNumberException;
import edu.handong.csee.java.hw6.exceptions.OneInputException;

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
        try{
            if (args.length != 2) {
                throw new OneInputException(ENGINE_NAME);
            }
            radius = Double.parseDouble(args[1]);
            if (radius < 0) {
                throw new NegativeNumberException(ENGINE_NAME);
            }
        } catch (OneInputException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            System.exit(0);
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
