package main.coderbyte.maxsubarray;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubarrayTest {
    @Test
    public void shouldReturnProperValues() {
        assertEquals(6, MaxSubarray.findMaximumSumOfSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, MaxSubarray.findMaximumSumOfSubArray(new int[]{1}));
        assertEquals(23, MaxSubarray.findMaximumSumOfSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}