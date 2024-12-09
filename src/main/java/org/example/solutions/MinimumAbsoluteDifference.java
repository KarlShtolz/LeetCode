package org.example.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 1200. Minimum Absolute Difference
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two
 * elements. Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 * a, b are from arr
 * a < b
 * b - a equals to the minimum absolute difference of any two elements in arr
 *
 * Example 1:
 * Input: arr = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 *
 * Example 2:
 * Input: arr = [1,3,6,10,15]
 * Output: [[1,3]]
 *
 * Example 3:
 * Input: arr = [3,8,-10,23,19,-4,-14,27]
 * Output: [[-14,-10],[19,23],[23,27]]
 */
public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff;
        int arrLength = arr.length;
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> tmp;
        minDiff = findMinDiff(arr);
        for (int i = 0; i < arrLength - 1; i++) {
            if (arr[i] - arr[i + 1] == minDiff || arr[i + 1] - arr[i] == minDiff) {
                tmp = new LinkedList<>();
                tmp.add(arr[i]);
                tmp.add(arr[i + 1]);
                ans.add(tmp);
            }
        }
        return ans;
    }
    public int findMinDiff (int [] arr) {
        int arrLength = arr.length;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arrLength - 1; i++) {
            if (arr[i] - arr[i + 1] < minDiff && arr[i] - arr[i + 1] > 0) {
                minDiff = arr[i] - arr[i + 1];
            }
            if (arr[i + 1] - arr[i] < minDiff && arr[i + 1] - arr[i] > 0) {
                minDiff = arr[i + 1] - arr[i];
            }
        }
        return minDiff;
    }
}
