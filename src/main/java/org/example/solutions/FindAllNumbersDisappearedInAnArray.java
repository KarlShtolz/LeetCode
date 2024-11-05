package org.example.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the
 * range [1, n] that do not appear in nums.
 *
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 *
 * Example 2:
 * Input: nums = [1,1]
 * Output: [2]
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst = new LinkedList<>();
        int l = nums.length;
        int tmp = 0;
        int [] arr = new int[l + 1];
        for (int i = 0; i < l; i++) {
            tmp = nums[i];
            arr[tmp]++;
        }
        for (int i = 1; i < l + 1; i++) {
            if (arr[i] == 0) {
                lst.add(i);
            }
        }
        return lst;
    }
}
