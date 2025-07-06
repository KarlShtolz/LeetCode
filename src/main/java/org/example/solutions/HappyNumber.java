package org.example.solutions;

/**
 * 202. Happy Number
 * Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not
 * include 1. Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * Example 1:
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * Example 2:
 * Input: n = 2
 * Output: false
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7){
            return true;
        }
        if (n >= 2 && n <= 9) {
            return false;
        }
        String s = "";
        int tmp = 0;
        int tmp2;
        while (n > 9) {
            s = Integer.toString(n);
            for (int i = 0; i < s.length(); i++) {
                tmp2 = Character.getNumericValue(s.charAt(i));
                tmp += (tmp2 * tmp2);
            }
            n = tmp;
            tmp = 0;
        }
        return n == 1 || n == 7;
    }
}
