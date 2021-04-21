package main.codewars.keypad;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeypadTest {
    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
    }
}