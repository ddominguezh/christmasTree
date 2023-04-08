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
        for(int i = 0 ; i < height ; i++){
            buffer.append(drawBranches(width, i));
        }
        buffer.append(drawTrunk(width));
        return buffer.toString();
    }

    private int getWidth(){
        return height * 2 - 1;
    }

    private String drawBranches(int width, int height){
        String[] branch = initArray(width);
        int start = (width / 2) - height;
        int end = (width / 2) + height;
        for (int position = start ; position <= end ; position++ ) {
            branch[position] = "X";
        }
        return String.join("",branch) +  "\n";
    }

    private String drawTrunk(int width){
        String[] trunk = initArray(width);
        trunk[ (width - 1) / 2 ] = "|";
        return String.join("",trunk);
    }

    private String[] initArray(int width){
        String[] array = new String[width];
        Arrays.fill(array, " ");
        return array;
    }
}
