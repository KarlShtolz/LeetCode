package org.example.solutions;

/**
 * 3340. Check Balanced String
 * You are given a string num consisting of only digits. A string of digits is called balanced if the sum of the digits
 * at even indices is equal to the sum of digits at odd indices.
 * Return true if num is balanced, otherwise return false.
 *
 * Example 1:
 * Input: num = "1234"
 * Output: false
 * Explanation:
 * The sum of digits at even indices is 1 + 3 == 4, and the sum of digits at odd indices is 2 + 4 == 6.
 * Since 4 is not equal to 6, num is not balanced.
 *
 * Example 2:
 * Input: num = "24123"
 * Output: true
 * Explanation:
 * The sum of digits at even indices is 2 + 1 + 3 == 6, and the sum of digits at odd indices is 4 + 2 == 6.
 * Since both are equal the num is balanced.
 */
public class CheckBalancedString {
    public boolean isBalanced(String num) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                s1 += Integer.valueOf(String.valueOf(num.charAt(i)));
            } else {
                s2 += Integer.valueOf(String.valueOf(num.charAt(i)));
            }
        }
        return s1 == s2;
    }
}
