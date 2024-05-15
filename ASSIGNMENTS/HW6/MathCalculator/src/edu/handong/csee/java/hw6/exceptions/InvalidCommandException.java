package edu.handong.csee.java.hw6.exceptions;

public class InvalidCommandException extends Exception{
    /**This is Constructor */
    public InvalidCommandException(){
        super("Exception-01: Invalid command:\nPlease put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL. For example, ./app  MAX 12 4 5 45 100");
    }

    public InvalidCommandException(String function){
        super("Exception-01: Invalid command: "+function+"/nPlease put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL. For example, ./app  MAX 12 4 5 45 100");
    }

}
