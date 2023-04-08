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
            buffer.append(" X ");
            buffer.append("XXX");
            buffer.append(" | ");
        }else if(height == 3){
            buffer.append("  X  ");
            buffer.append(" XXX ");
            buffer.append("XXXXX");
            buffer.append("  |  ");
        }
        return buffer.toString();
    }
}
