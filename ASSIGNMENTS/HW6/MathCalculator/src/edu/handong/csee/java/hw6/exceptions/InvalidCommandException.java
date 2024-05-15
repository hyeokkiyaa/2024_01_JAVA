package edu.handong.csee.java.hw6.exceptions;

public class InvalidCommandException extends Exception{
    /**This is Constructor */
    public InvalidCommandException(){
        super(getString());
    }

    public InvalidCommandException(String function){
        super(getString(function));
    }

    public static String getString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Exception-01: Invalid command:\n");
        sb.append("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL. For example, ./app  MAX 12 4 5 45 100");
        return sb.toString();
    }

    public static String getString(String function){
        StringBuilder sb = new StringBuilder();
        sb.append("Exception-01: Invalid command: ");
        sb.append(function+"\n");
        
        sb.append("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL. For example, ./app  MAX 12 4 5 45 100");
        return sb.toString();
    }
}
