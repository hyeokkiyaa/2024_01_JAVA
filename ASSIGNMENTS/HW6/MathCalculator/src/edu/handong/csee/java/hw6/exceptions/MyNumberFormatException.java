package edu.handong.csee.java.hw6.exceptions;
/** This is is a comment for when engine name given is wrong or nothing */
public class MyNumberFormatException extends NumberFormatException{
    /**
     * This is Constructor
     */
    public MyNumberFormatException(){
        super("Exception-05: The input value should be converted into a number.");
    }

    /**
     * This is overload of Constructor
     * @param function  name of Engine Name
     * @param value value input wrongly inputted
     */
    public MyNumberFormatException(String function, String value){
        super("Exception-05: The input value should be converted into a number. ("+value+" is not a number value for "+function+".)");
    }
    
}
