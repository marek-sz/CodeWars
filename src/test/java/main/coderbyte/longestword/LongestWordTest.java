package main.coderbyte.longestword;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestWordTest {
    @Test
    public void test1() {
        assertEquals(LongestWord.LongestWord("fun&!! time"), "time");
        assertEquals(LongestWord.LongestWord("I love dogs"), "love");
    }

}