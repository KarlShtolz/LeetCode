package org.example.solutions;

import java.util.Arrays;

/**
 * 594. Longest Harmonious Subsequence
 * We define a harmonious array as an array where the difference between its maximum value and its minimum value is
 * exactly 1. Given an integer array nums, return the length of its longest harmonious subsequence among all its
 * possible subsequences.
 *
 * Example 1:
 * Input: nums = [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation:
 * The longest harmonious subsequence is [3,2,2,2,3].
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: 2
 * Explanation:
 * The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.
 *
 * Example 3:
 * Input: nums = [1,1,1,1]
 * Output: 0
 * Explanation:
 * No harmonic subsequence exists.
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int max = 0;
        for(int r = 1; r < nums.length; r++) {
            while(nums[r] - nums[l] > 1)
                l++;
            if(nums[r] - nums[l] == 1)
                max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
