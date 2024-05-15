package edu.handong.csee.java.hw6.exceptions;

public class MyNumberFormatException extends Exception{
    public MyNumberFormatException(){
        super("Exception-05: The input value should be converted into a number.");
    }

    public MyNumberFormatException(String function, String value){
        super("Exception-05: The input value should be converted into a number. ("+value+"is not a number value for "+function+".)");
    }
    
}
