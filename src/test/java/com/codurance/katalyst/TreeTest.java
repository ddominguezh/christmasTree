package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreeTest {
    
    @Test
    public void create_tree_with_height_two()
    {
        StringBuffer expected = new StringBuffer();
        expected.append(" X \n");
        expected.append("XXX\n");
        expected.append(" | ");
        assertEquals(expected.toString(), Tree.create(2).draw());
    }

    @Test
    public void create_tree_with_height_three(){
        StringBuffer expected = new StringBuffer();
        expected.append("  X  \n");
        expected.append(" XXX \n");
        expected.append("XXXXX\n");
        expected.append("  |  ");
        assertEquals(expected.toString(), Tree.create(3).draw());
    }
}
