package org.example.solutions;

/**
 * 342. Power of Four
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 *
 * Example 1:
 * Input: n = 16
 * Output: true
 *
 * Example 2:
 * Input: n = 5
 * Output: false
 *
 * Example 3:
 * Input: n = 1
 * Output: true
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n == 0 || n == 2 || n == 3 || n < 0) {
            return false;
        }
        if (n == 1 || n == 4) {
            return true;
        }
        int tmp = -1;
        while (tmp != 4) {
            tmp = n / 4;
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
            if (tmp == 1) {
                return true;
            }
        }
        return true;
    }
}
