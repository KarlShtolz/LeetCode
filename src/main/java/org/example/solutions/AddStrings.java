package org.example.solutions;

/**
 * 415. Add Strings
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You
 * must also not convert the inputs to integers directly.
 *
 * Example 1:
 * Input: num1 = "11", num2 = "123"
 * Output: "134"
 *
 * Example 2:
 * Input: num1 = "456", num2 = "77"
 * Output: "533"
 *
 * Example 3:
 * Input: num1 = "0", num2 = "0"
 * Output: "0"
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        int tmp = 0;
        StringBuilder result = new StringBuilder();
        while(l1 >= 0 || l2 >= 0 || tmp != 0) {
            int a = (l1 >= 0) ? num1.charAt(l1) - '0' : 0;
            int b = (l2 >= 0) ? num2.charAt(l2) - '0' : 0;
            int sum = a + b + tmp;
            int digit = sum % 10;
            tmp = sum / 10;
            result.append(digit);
            l1--;
            l2--;
        }
        return result.reverse().toString();
    }
}
