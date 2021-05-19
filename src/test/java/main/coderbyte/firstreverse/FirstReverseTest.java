package main.coderbyte.firstreverse;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstReverseTest {
    @Test
    public void shouldSimplyReverseString() {
        assertEquals(FirstReverse.firstReverse("coderbyte"), "etybredoc");
        assertEquals(FirstReverse.firstReverse("I Love Code"), "edoC evoL I");
    }
}