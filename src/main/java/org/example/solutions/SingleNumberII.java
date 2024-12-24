package org.example.solutions;

import java.util.Arrays;

/**
 * 137. Single Number II
 * Given an integer array nums where every element appears three times except for one, which appears exactly once.
 * Find the single element and return it. You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 *
 * Example 1:
 * Input: nums = [2,2,3,2]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [0,1,0,1,0,1,99]
 * Output: 99
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int l = nums.length;
        Arrays.sort(nums);
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[l - 1] != nums[l - 2]) {
            return nums[l - 1];
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
    /**
     * нужно разобрать
     *
     */
    // public int singleNumber(int[] nums) {
    //     int ones = 0;
    //     int twos = 0;
    //     for (final int num : nums) {
    //         ones ^= (num & ~twos);
    //         twos ^= (num & ~ones);
    //     }
    //     return ones;
    // }
}
