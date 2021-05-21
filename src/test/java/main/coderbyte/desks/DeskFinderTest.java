package main.coderbyte.desks;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeskFinderTest {

    @Test
    public void countNeighbourDesks() {
        assertEquals(4, DeskFinder.countDesks(new int[]{6, 4}));
    }

}