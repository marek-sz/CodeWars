package main.euler.problem001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultipliesOf3And5Test {
    @Test
    void sumOfAll() {
        assertEquals(23, MultipliesOf3And5.sumOfAll(10));
    }
}