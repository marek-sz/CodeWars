package main.coderbyte.maxsubarray;

import java.util.Arrays;

public class MaxSubarray {
    public static int findMaximumSumOfSubArray(int[] nums) {
        int currentMaxSum;
        int totalMaxSum = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; i++) {
            currentMaxSum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                currentMaxSum += nums[j];
                totalMaxSum = Math.max(currentMaxSum, totalMaxSum);
            }
        }
        return totalMaxSum;
    }
}