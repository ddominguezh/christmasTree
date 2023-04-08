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
        for(int row = 0 ; row < height ; row++){
            buffer.append(drawBranches(row));
        }
        buffer.append(drawTrunk());
        return buffer.toString();
    }

    private String drawBranches(int row){
        String[] branch = initArray();
        int start = getCenterPosition() - row;
        int end = getCenterPosition() + row;
        for (int position = start ; position <= end ; position++ ) {
            branch[position] = "X";
        }
        return String.join("",branch) +  "\n";
    }

    private String drawTrunk(){
        String[] trunk = initArray();
        trunk[ getCenterPosition() ] = "|";
        return String.join("",trunk);
    }

    private String[] initArray(){
        String[] array = new String[getWidth()];
        Arrays.fill(array, " ");
        return array;
    }

    private int getCenterPosition(){
        return getWidth() / 2;
    }

    private int getWidth(){
        return height * 2 - 1;
    }
}
