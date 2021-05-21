package main.coderbyte.stringreplacement;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReplacerTest {

    @Test
    public void shouldReplaceString() {
        assertEquals("3w3b3c", StringReplacer.convertString("wwwbbbccc"));
    }

}