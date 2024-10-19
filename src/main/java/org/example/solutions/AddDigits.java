package org.example.solutions;

/**
 * 258. Add Digits
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 *
 * Example 1:
 * Input: num = 38
 * Output: 2
 * Explanation: The process is
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2
 * Since 2 has only one digit, return it.
 *
 * Example 2:
 * Input: num = 0
 * Output: 0
 */
public class AddDigits {
    public int addDigits(int num) {
        int a = 0;
        String tmp = "";
        char [] arr;
        while (num > 9) {
            tmp = String.valueOf(num);
            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i) == '1') {
                    a += 1;
                } else if (tmp.charAt(i) == '2') {
                    a += 2;
                } else if (tmp.charAt(i) == '3') {
                    a += 3;
                } else if (tmp.charAt(i) == '4') {
                    a += 4;
                } else if (tmp.charAt(i) == '5') {
                    a += 5;
                } else if (tmp.charAt(i) == '6') {
                    a += 6;
                } else if (tmp.charAt(i) == '7') {
                    a += 7;
                } else if (tmp.charAt(i) == '8') {
                    a += 8;
                } else if (tmp.charAt(i) == '9') {
                    a += 9;
                }
            }
            num = a;
            a = 0;
        }
        return num;
    }
}
