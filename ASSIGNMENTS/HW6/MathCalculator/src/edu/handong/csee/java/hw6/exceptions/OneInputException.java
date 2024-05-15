package edu.handong.csee.java.hw6.exceptions;

public class OneInputException extends Exception{
    public OneInputException(){
        super("Exception-04: You need one input value");
    }

    public OneInputException(String function){
        super("Exception-04: You need one input value for "+function+".");
    }    
}
