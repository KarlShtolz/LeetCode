package org.example.solutions;

/**
 * 169. Majority Element
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
 * always exists in the array.
 *
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int countM = 1;
        int numbeM = nums[0];
        int countT = 0;
        int numbeT = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == numbeM) {
                countM++;
            }
            if (nums[i] != numbeM) {
                numbeT = nums[i];
                countT++;
            }
            if (countT > countM) {
                countM = countT;
                numbeM = numbeT;
            }
        }
        return numbeM;
    }
}
