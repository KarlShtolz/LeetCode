package org.example.solutions;

/**
 * 3345. Smallest Divisible Digit Product I
 * You are given two integers n and t. Return the smallest number greater than or equal to n such that the product of
 * its digits is divisible by t.
 *
 * Example 1:
 * Input: n = 10, t = 2
 * Output: 10
 * Explanation:
 * The digit product of 10 is 0, which is divisible by 2, making it the smallest number greater than or equal to 10
 * that satisfies the condition.
 *
 * Example 2:
 * Input: n = 15, t = 3
 * Output: 16
 * Explanation:
 * The digit product of 16 is 6, which is divisible by 3, making it the smallest number greater than or equal to 15
 * that satisfies the condition.
 */
public class SmallestDivisibleDigitProductI {
    public int smallestNumber(int n, int t) {
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            if (getMultiplyOfDigitsInInteger(i) % t == 0) {
                return i;
            }
        }
        return -1;
    }
    public int getMultiplyOfDigitsInInteger (int num) {
        int ans = 1;
        int ld = 0;
        while (num != 0) {
            ld = num % 10;
            ans *= ld;
            num /= 10;
        }
        return ans;
    }
}
