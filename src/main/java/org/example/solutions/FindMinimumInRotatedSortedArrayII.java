package org.example.solutions;

/**
 * 154. Find Minimum in Rotated Sorted Array II
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array
 * nums = [0,1,4,4,5,6,7] might become:
 * [4,5,6,7,0,1,4] if it was rotated 4 times.
 * [0,1,4,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array
 * [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
 * You must decrease the overall operation steps as much as possible.
 *
 * Example 1:
 * Input: nums = [1,3,5]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [2,2,2,0,1]
 * Output: 0
 */
public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }
        if (nums.length == 3) {
            return Math.min(Math.min(nums[0], nums[1]), nums[2]);
        }
        int ptr1 = 0;
        int ptr2 = nums.length - 1;
        int ptr3 = (nums.length / 2);
        int ptr4 = (nums.length / 2) + (nums.length % 2);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length / 4 + 1; i++) {
            if (nums[ptr1] < min) {
                min = nums[ptr1];
            }
            if (nums[ptr2] < min) {
                min = nums[ptr2];
            }
            if (nums[ptr3] < min) {
                min = nums[ptr3];
            }
            if (nums[ptr4] < min) {
                min = nums[ptr4];
            }
            ptr1++;
            ptr2--;
            if (ptr3 > 0) {
                ptr3--;
            }
            if (ptr4 < nums.length - 1) {
                ptr4++;
            }
        }
        return min;
    }
}
