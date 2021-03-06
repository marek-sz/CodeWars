package main.codewars.directionsreductions;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DirReductionTest {
    @Test
    public void testSimpleDirReduc() {
        assertArrayEquals("\"NORTH\",\"WEST\",\"SOUTH\",\"EAST\"", new String[]{"NORTH", "WEST", "SOUTH", "EAST"}, DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
        assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
                new String[]{},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
    }
}