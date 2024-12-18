package org.example.solutions;

/**
 * 1399. Count Largest Group
 * You are given an integer n.
 * Each number from 1 to n is grouped according to the sum of its digits.
 * Return the number of groups that have the largest size.
 *
 * Example 1:
 * Input: n = 13
 * Output: 4
 * Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
 * [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
 * There are 4 groups with largest size.
 *
 * Example 2:
 * Input: n = 2
 * Output: 2
 * Explanation: There are 2 groups [1], [2] of size 1.
 */
public class CountLargestGroup {
    public int countLargestGroup(int n) {
        int[] groups = new int[37];
        int result = 0;
        for (int i = 1; i <= n; i++) {
            groups[sumOfDigits(i)]++;
        }
        int maxCount = 0;
        for(int m : groups) {
            if(m > maxCount) {
                maxCount = m;
                result = 1;
            } else if(m == maxCount) {
                result++;
            }
        }
        return result;
    }
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
}
