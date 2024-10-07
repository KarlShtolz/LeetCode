package org.example.solutions;

import java.util.Arrays;

/**
 * 3300. Minimum Element After Replacement With Digit Sum
 * You are given an integer array nums.
 * You replace each element in nums with the sum of its digits.
 * Return the minimum element in nums after all replacements.
 *
 * Example 1:
 * Input: nums = [10,12,13,14]
 * Output: 1
 * Explanation:
 * nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: 1
 * Explanation:
 * nums becomes [1, 2, 3, 4] after all replacements, with minimum element 1.
 *
 * Example 3:
 * Input: nums = [999,19,199]
 * Output: 10
 * Explanation:
 * nums becomes [27, 10, 19] after all replacements, with minimum element 10.
 */
public class MinimumElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {
        int tmpCharInt = 0;
        int tmpInt = 0;
        String tmpString = "";
        for (int i = 0; i < nums.length; i++) {
            tmpString = String.valueOf(nums[i]);
            for (int j = 0; j < tmpString.length(); j++) {
                tmpCharInt = Integer.valueOf(String.valueOf(tmpString.charAt(j)));
                //System.out.println(tmpCharInt);
                tmpInt += tmpCharInt;
            }
            nums[i] = tmpInt;
            tmpString = "";
            tmpInt = 0;
        }
        return Arrays.stream(nums).min().orElseThrow();
    }
}
