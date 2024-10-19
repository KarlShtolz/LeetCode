package org.example.solutions;

/**
 * 287. Find the Duplicate Number
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and using only constant extra space.
 *
 * Example 1:
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 *
 * Example 2:
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 *
 * Example 3:
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        //best time
        int [] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] != 0) {
                return nums[i];
            } else {
                arr[nums[i]]++;
            }
        }
        return -1;

        //first Solution
        // int tmp = 0;
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         return nums[i];
        //     }
        // }
        // return -1;

        //second Solution
        // Set<Integer> set = new HashSet<Integer>();
        // for (int i = 0; i < nums.length; i++) {
        //     set.add(nums[i]);
        //     if (set.size() != (i + 1)) {
        //         return nums[i];
        //     }
        // }
        // return -1;
    }
}
