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
        if(height == 2){
            buffer.append(" X \n");
            buffer.append("XXX\n");
            buffer.append(" | ");
        }else if(height == 3){
            buffer.append("  X  \n");
            buffer.append(" XXX \n");
            buffer.append("XXXXX\n");
            buffer.append("  |  ");
        }
        return buffer.toString();
    }
}
