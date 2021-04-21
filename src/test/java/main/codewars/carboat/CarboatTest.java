package main.codewars.carboat;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarboatTest {
    @Test
    public void BasicTests() {
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]", Carboat.howmuch(1, 100));
        assertEquals("[]", Carboat.howmuch(2950, 2950));
        assertEquals("[[M: 9991 B: 1427 C: 1110]]", Carboat.howmuch(9999, 9990));
    }
}
