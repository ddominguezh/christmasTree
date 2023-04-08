package com.codurance.katalyst;

public class InvalidHeightTreeException extends RuntimeException{
    
    public InvalidHeightTreeException(int height){
        super("Invalid Height: " + height);
    }
}
