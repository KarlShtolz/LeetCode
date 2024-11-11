package org.example.solutions;

import java.util.Arrays;

/**
 * 350. Intersection of Two Arrays II
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must
 * appear as many times as it shows in both arrays and you may return the result in any order.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 *
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] shortArr = (nums1.length < nums2.length) ? nums1 : nums2;
        int[] longArr = (nums1.length < nums2.length) ? nums2 : nums1;
        int[] temporary = new int[1001];
        for (int num : shortArr) {
            temporary[num]++;
        }
        int[] temporary2 = new int[shortArr.length];
        int index = 0;
        for (int num : longArr) {
            if (temporary[num] > 0) {
                temporary2[index++] = num;
                temporary[num]--;
            }
        }
        return Arrays.copyOf(temporary2, index);
    }
}
