package org.example.solutions;

/**
 * 896. Monotonic Array
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if
 * for all i <= j, nums[i] >= nums[j].
 * Given an integer array nums, return true if the given array is monotonic, or false otherwise.
 *
 * Example 1:
 * Input: nums = [1,2,2,3]
 * Output: true
 *
 * Example 2:
 * Input: nums = [6,5,4,4]
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,3,2]
 * Output: false
 */
public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1 || nums.length == 2) {
            return true;
        }
        int flag = 0;
        if (nums[0] > nums[1]) {
            flag = -1;
        }
        if (nums[0] < nums[1]) {
            flag = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (flag == -1) {
                    return false;
                }
                flag = 1;
            }
            if (nums[i] < nums[i - 1]) {
                if (flag == 1) {
                    return false;
                }
                flag = -1;
            }
        }
        return true;
    }
}
