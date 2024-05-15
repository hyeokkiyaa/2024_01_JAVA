package edu.handong.csee.java.hw6.engines;

/**
 * The Computable interface defines the methods required for a class to perform computation.
 * Classes implementing this interface should be able to set input values, compute results, and return the result.
 */
public interface Computable {

    /**
     * Sets the input values required for the computation.
     * @param args An array of String arguments containing input values.
     */
    void setInput(String[] args);

    /**
     * Computes the result based on the input values.
     */
    void compute();

    /**
     * Returns the result of the computation.
     * @return The result of the computation.
     */
    double getResult();
}
