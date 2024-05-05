package edu.handong.csee.java.recursion;

import edu.handong.csee.java.recursion.RecursionTasks;

/**
 * A class to demonstrate recursive tasks.
 */
public class RecursionDemonstrator {
    /**Constructor for RecursionDemonstrator class */
    RecursionDemonstrator(){

    }
    
    /**
     * The main method of the program.
     * 
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        RecursionDemonstrator MyRecursionDemonstrator = new RecursionDemonstrator();
        MyRecursionDemonstrator.run(args); 
    }

    /**
     * Runs the recursion tasks based on the provided command line arguments.
     * 
     * @param args The command line arguments.
     */
    public void run(String[] args) {
        RecursionTasks recursion = new RecursionTasks();
        if (args.length == 0) {
            System.out.println("Please put a computing recursion task option such as factorial, bunnyEars, countHi, changePi, endX, stringClean, strDist, decimal2binary, decodeString and parseBoolExpr. For example, java -cp [your classpath]\n edu.handong.csee.java.recursion.RecursionDemonstrator factorial 10");
        }
        recursion.setTaskName(args[0]);
        recursion.setInputArgs(args);
        recursion.compute();
        System.out.println(recursion.getResult());
    }
}
