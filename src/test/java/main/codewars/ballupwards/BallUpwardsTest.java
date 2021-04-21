package main.codewars.ballupwards;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallUpwardsTest {
    @Test
    public void test() {
        assertEquals(4, BallUpwards.maxBall(15));
        assertEquals(7, BallUpwards.maxBall(25));
    }
}