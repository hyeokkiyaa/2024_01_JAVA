package edu.handong.csee.java.recursion;

import javax.swing.plaf.ComponentUI;

import edu.handong.csee.java.recursion.RecursionTasks;

public class RecursionDemonstrator{
    public static void main(String[] args){
        RecursionDemonstrator MyRecursionDemonstrator = new RecursionDemonstrator();
        MyRecursionDemonstrator.run(args); 
    }

    public void run(String[] args){
        RecursionTasks recursion = new RecursionTasks();
        recursion.setTaskName(args[0].toUpperCase());
        recursion.setInput(args);

    }
}