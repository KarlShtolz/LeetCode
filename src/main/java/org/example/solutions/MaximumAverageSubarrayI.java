package org.example.solutions;

/**
 * 643. Maximum Average Subarray I
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any
 * answer with a calculation error less than 10-5 will be accepted.
 *
 * Example 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 *
 * Example 2:
 * Input: nums = [5], k = 1
 * Output: 5.00000
 */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double summ = 0;
        double average = 0;
        double maxAverage = 0;
        if (nums.length == 1 && k == 1) {
            return nums[0];
        }
        if (nums.length == k) {
            for (int i = 0; i < k; i++) {
                summ += nums[i];
            }
            return summ / k;
        }
        for (int i = 0; i < k; i++) {
            summ += nums[i];
        }
        maxAverage = summ / k;
        for (int i = k; i < nums.length; i++) {
            summ -= (nums[i - k]);
            summ += nums[i];
            average = summ / k;
            if (average > maxAverage) {
                maxAverage = average;
            }
        }
        return maxAverage;
    }
}
