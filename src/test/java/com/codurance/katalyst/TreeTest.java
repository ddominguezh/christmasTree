package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TreeTest {
    
    @Test
    public void create_tree_with_height_one()
    {
        StringBuffer expected = new StringBuffer();
        expected.append("X\n");
        expected.append("|");
        assertEquals(expected.toString(), Tree.create(1).draw());
    }

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
    @Test
    public void create_tree_with_height_ten(){
        StringBuffer expected = new StringBuffer();
        expected.append("         X         \n");
        expected.append("        XXX        \n");
        expected.append("       XXXXX       \n");
        expected.append("      XXXXXXX      \n");
        expected.append("     XXXXXXXXX     \n");
        expected.append("    XXXXXXXXXXX    \n");
        expected.append("   XXXXXXXXXXXXX   \n");
        expected.append("  XXXXXXXXXXXXXXX  \n");
        expected.append(" XXXXXXXXXXXXXXXXX \n");
        expected.append("XXXXXXXXXXXXXXXXXXX\n");
        expected.append("         |         ");
        assertEquals(expected.toString(), Tree.create(10).draw());
    }

    @Test
    public void cannot_create_tree_with_zero_height(){
        assertThrows(InvalidHeightTreeException.class, () -> Tree.create(0));
    }

    @Test
    public void cannot_create_tree_with_negative_height(){
        assertThrows(InvalidHeightTreeException.class, () -> Tree.create(-1));
        assertThrows(InvalidHeightTreeException.class, () -> Tree.create(Integer.MIN_VALUE));
    }
}
