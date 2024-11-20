package org.example.solutions;

/**
 * 922. Sort Array By Parity II
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
 * Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
 * Return any answer array that satisfies this condition.
 *
 * Example 1:
 * Input: nums = [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 *
 * Example 2:
 * Input: nums = [2,3]
 * Output: [2,3]
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int tmp = 0;
        int ptr = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            ptr = i;
            if (nums[i] % 2 == 0 && i % 2 != 0) {
                tmp = nums[i];
                while (nums[ptr] % 2 == 0) {
                    ptr++;
                }
                nums[i] = nums[ptr];
                nums[ptr] = tmp;
                ptr = i;
            }
            if (nums[i] % 2 != 0 && i % 2 == 0) {
                tmp = nums[i];
                while (nums[ptr] % 2 != 0) {
                    ptr++;
                }
                nums[i] = nums[ptr];
                nums[ptr] = tmp;
                ptr = i;
            }
        }
        return nums;
    }
}
