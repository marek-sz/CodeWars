package main.hackerrank.javacomparator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckerTest {
    Player david, heraldo, amy, aakansha, aleksa;
    Checker checker;

    @Before
    public void initiate() {
        david = new Player("david", 100);
        heraldo = new Player("heraldo", 50);
        amy = new Player("amy", 100);
        aakansha = new Player("aakansha", 75);
        aleksa = new Player("aleksa", 150);
        checker = new Checker();
    }

    @Test
    public void shouldCompareTwoPlayersByScore() {
        Player david = new Player("david", 100);
        Player heraldo = new Player("heraldo", 50);
        Player amy = new Player("amy", 100);
        Player aakansha = new Player("aakansha", 75);
        Player aleksa = new Player("aleksa", 150);

        assertEquals(1, checker.compare(david, heraldo));
        assertEquals(-1, checker.compare(heraldo, david));
        assertEquals(-1, checker.compare(aakansha, aleksa));
        assertEquals(1, checker.compare(amy, heraldo));
    }
}