package org.example.solutions;

/**
 * 283. Move Zeroes
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero
 * elements. Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int [] nums2 = new int[nums.length];
        int k = 0;
        for (int num : nums) {
            if (num != 0) {
                nums2[k] = num;
                k++;
            }
        }
        System.arraycopy(nums2, 0, nums, 0, nums.length);
    }
}
