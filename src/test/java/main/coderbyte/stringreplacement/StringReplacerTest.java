package main.coderbyte.stringreplacement;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReplacerTest {
    @Test
    public void shouldReplaceString() {
        assertEquals("3w3b3c", StringReplacer.convertString("wwwbbbccc"));
        assertEquals("1a1b1c", StringReplacer.convertString("abc"));
        assertEquals("1a", StringReplacer.convertString("a"));
    }
}