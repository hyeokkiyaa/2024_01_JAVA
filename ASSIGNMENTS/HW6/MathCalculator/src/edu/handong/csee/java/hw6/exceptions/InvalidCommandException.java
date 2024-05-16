package edu.handong.csee.java.hw6.exceptions;
/**
 * This will print out error message where name is not given or name does not exist
 */
public class InvalidCommandException extends Exception{
    /**This is Constructor */
    public InvalidCommandException(){
        super(getString());
    }

    /**
     * This is OverLoad of Constructor with function Name given from User
     * @param function  Engine_Name received from User
     */
    public InvalidCommandException(String function){
        super(getString(function));
    }

    /**
     * This will return comment for constructor
     * @return  comments will be returned if function name is not given at all
     */
    public static String getString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Exception-01: Invalid command: \n");
        sb.append("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL. For example, ./app  MAX 12 4 5 45 100");
        
        return sb.toString();
    }

    /**
     * This will return comment for overload constructor
     * @param function  Name of Engine
     * @return  Error message will be returned
     */
    public static String getString(String function){
        StringBuilder sb = new StringBuilder();
        sb.append("Exception-01: Invalid command: ");
        sb.append(function+"\n");
        
        sb.append("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL. For example, ./app  MAX 12 4 5 45 100");
        return sb.toString();
    }
}
