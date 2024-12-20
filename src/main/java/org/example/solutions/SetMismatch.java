package org.example.solutions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 645. Set Mismatch
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some
 * error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one
 * number and loss of another number.
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 *
 * Example 1:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 *
 * Example 2:
 * Input: nums = [1,1]
 * Output: [1,2]
 */
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int [] ans = new int[2];
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!lst.contains(nums[i])) {
                lst.add(nums[i]);
            } else {
                ans[0] = nums[i];
            }
            ans[1] ^= (i + 1);
            ans[1] ^= nums[i];
        }
        ans[1] ^= ans[0];
        return ans;
    }
}
