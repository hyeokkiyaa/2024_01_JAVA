package edu.handong.csee.java.hw6.exceptions;
/**This will return error message when engine must receive at least one input value */
public class OneInputException extends Exception{
    /**This is Constructor */
    public OneInputException(){
        super("Exception-04: You need one input value");
    }

    /**
     * This is overload of constructor with parameter of string
     * @param function Engine name
     */
    public OneInputException(String function){
        super("Exception-04: You need one input value for "+function+".");
    }    
}
