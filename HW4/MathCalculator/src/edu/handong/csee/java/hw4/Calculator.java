package edu.handong.csee.java.hw4;

import edu.handong.csee.java.hw4.engines.*;

/**
 * A class to perform various types of calculations.
 */
public class Calculator {

    /**
     * Constructs a new Calculator object.
     */
    public Calculator() {
    }

    /**
     * The main method of the Calculator class.
     * 
     * @param args The command-line arguments passed when the program starts.
     */
    public static void main(String[] args) {
        /**
         * Creates an instance of the Calculator class.
         */
        Calculator myCalculator = new Calculator();

        // Calls the run method to execute the calculator with the specified arguments.
        myCalculator.run(args);
    }

    /**
     * Runs the calculator with the specified arguments.
     * 
     * @param args The command-line arguments passed when the program starts.
     */
    public void run(String[] args) {
        if(args.length==0){
            System.out.println("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL.");
            System.out.println("For example, java -cp [your classpath] edu.handong.csee.java.hw4.Calculator MAX 12 4 5 45 100");
            System.exit(0); 
        }
        // Converts the first argument to uppercase to match the engine names.
        String engineName = args[0].toUpperCase();

        // Declares a variable to hold the computable engine.
        Computable engine = null;

        // Chooses the appropriate engine based on the specified engine name.
        switch(engineName) {
            case "LCM":
                engine = new LCMEngine();
                break;
            case "GCD":
                engine = new GCDEngine();
                break;
            case "SQRT":
                engine = new SQRTEngine();
                break;
            case "FACTORIAL":
                engine = new FactorialEngine();
                break;
            case "FIBONACCI":
                engine = new FibonacciEngine();
                break;
            case "MAX":
                engine = new MaxEngine();
                break;
            case "MIN":
                engine = new MinEngine();
                break;
            case "CUBEVOL":
                engine = new CubeVolEngine();
                break;
            case "SPHEREVOL":
                engine = new SphereVolEngine();
                break;
            default:
                System.out.println("Invalid command: " + engineName);
                System.exit(0);
        }

        // Sets the input values for the engine.
        engine.setInput(args);
        // Computes the result using the specified engine.
        engine.compute();

        // Prints the result of the computation.
        System.out.println("The result of " +  engineName + " is " + engine.getResult() + ".");
    }
}
