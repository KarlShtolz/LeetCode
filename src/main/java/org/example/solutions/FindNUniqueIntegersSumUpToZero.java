package org.example.solutions;

/**
 * 1304. Find N Unique Integers Sum up to Zero
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 *
 * Example 1:
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
 *
 * Example 2:
 * Input: n = 3
 * Output: [-1,0,1]
 *
 * Example 3:
 * Input: n = 1
 * Output: [0]
 */
public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        if (n == 1) {
            return new int[]{0};
        }
        int [] arr = new int[n];
        int summa = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = 0 - i - 100;
            summa += arr[i];
        }
        arr[n-1] = 0 - summa;
        return arr;
    }
}
