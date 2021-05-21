package main.coderbyte.bracketmatcher;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketMatcherTest {
    @Test
    public void test() {
        assertEquals(0, BracketMatcher.bracketMatcher("(coder)(byte))"));
        assertEquals(1, BracketMatcher.bracketMatcher("(c(oder)) b(yte)"));
    }

    @Test
    public void stackApproachTest() {
        assertEquals(0, BracketMatcher.stackApproach("(coder)(byte))"));
        assertEquals(1, BracketMatcher.stackApproach("(c(oder)) b(yte)"));
    }
}