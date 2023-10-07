package org.example.solutions;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 *
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */
public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 1 && target == nums[0]) {
            return new int[]{0, 0};
        }
        return new int[]{searchFirst(nums, target), searchLast(nums, target)};
    }
    public int searchFirst(int[] nums, int target) {
        int first = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                return first;
            }
        }
        return first;
    }
    public int searchLast(int[] nums, int target) {
        int last = -1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[i] == target) {
                last = i;
                return last;

            }
        }
        return last;
    }
}
