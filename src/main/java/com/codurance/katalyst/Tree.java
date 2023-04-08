package com.codurance.katalyst;

public class Tree {
    
    private int height;
    private Tree(int height){
        this.height = height;
    }
    public static Tree create(int height){
        return new Tree(height);
    }
    public String draw(){
        StringBuffer buffer = new StringBuffer();
        buffer.append(" X ");
        buffer.append("XXX");
        buffer.append(" | ");
        return buffer.toString();
    }
}
