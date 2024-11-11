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
        int[] smallArr = (nums1.length < nums2.length) ? nums1 : nums2;
        int[] largeArr = (nums1.length < nums2.length) ? nums2 : nums1;
        int[] count = new int[1001];
        for (int num : smallArr) {
            count[num]++;
        }
        int[] tmp = new int[smallArr.length];
        int index = 0;
        for (int num : largeArr) {
            if (count[num] > 0) {
                tmp[index++] = num;
                count[num]--;
            }
        }
        int[] result = Arrays.copyOf(tmp, index);
        return result;
    }
}
