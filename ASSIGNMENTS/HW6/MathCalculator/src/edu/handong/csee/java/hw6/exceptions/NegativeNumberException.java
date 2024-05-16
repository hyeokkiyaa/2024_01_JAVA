package edu.handong.csee.java.hw6.exceptions;

/**This is for when negative number is input, comment will be returned */
public class NegativeNumberException extends Exception{
    /**
     * This is constructor
     */
    public NegativeNumberException(){
        super("Exception-03: The input value cannot be negative.");
    }

    /**
     * This is overload of construcotr with certain engine name given by User
     * @param function  will return comment
     */
    public NegativeNumberException(String function){
        super("Exception-03: The input value cannot be negative for "+function+".");
    }
}
