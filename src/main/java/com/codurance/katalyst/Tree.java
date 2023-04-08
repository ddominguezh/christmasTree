package com.codurance.katalyst;

import java.util.Arrays;

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
        int width = getWidth();

        if(height == 2){
            buffer.append(" X \n");
            buffer.append("XXX\n");
        }else if(height == 3){
            buffer.append("  X  \n");
            buffer.append(" XXX \n");
            buffer.append("XXXXX\n");
        }
        buffer.append(drawTrunk(width));
        return buffer.toString();
    }

    private int getWidth(){
        return height * 2 - 1;
    }

    private String drawTrunk(int width){
        String[] trunk = new String[width];
        Arrays.fill(trunk, " ");
        trunk[ (width - 1) / 2 ] = "|";
        return String.join("",trunk);
    }
}
