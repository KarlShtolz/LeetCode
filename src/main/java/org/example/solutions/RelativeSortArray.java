package org.example.solutions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1122. Relative Sort Array
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do
 * not appear in arr2 should be placed at the end of arr1 in ascending order.
 *
 * Example 1:
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 *
 * Example 2:
 * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
 * Output: [22,28,8,6,17,44]
 */
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        ArrayList<Integer> lst = new ArrayList<>();
        int [] fl = new int[l2];
        int [] res = new int[l1];
        int k = 0;
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < l1; j++) {
                if (arr1[j] == arr2[i]) {
                    fl[i]++;
                    arr1[j] = Integer.MIN_VALUE;
                }
            }
        }
        Arrays.sort(arr1);
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < fl[i]; j++) {
                res[k] = arr2[i];
                k++;
            }
        }
        for (int i = 0; i < l1; i++) {
            if (arr1[i] != Integer.MIN_VALUE) {
                res[k] = arr1[i];
                k++;
            }
        }
        return res;
    }
}
