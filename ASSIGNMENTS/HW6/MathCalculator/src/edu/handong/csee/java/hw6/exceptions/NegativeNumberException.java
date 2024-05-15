package edu.handong.csee.java.hw6.exceptions;

public class NegativeNumberException extends Exception{
    public NegativeNumberException(){
        super("Exception-03: The input value cannot be negative");
    }

    public NegativeNumberException(String function){
        super("Exception-03: The input value cannot be negative for "+function);
    }
}
