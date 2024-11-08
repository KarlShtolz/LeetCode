package org.example.solutions;

/**
 * 541. Reverse String II
 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start
 * of the string. If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater
 * than or equal to k characters, then reverse the first k characters and leave the other as original.
 *
 * Example 1:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 *
 * Example 2:
 * Input: s = "abcd", k = 2
 * Output: "bacd"
 */
public class ReverseStringII {
    public void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start++] = charArray[end];
            charArray[end--] = temp;
        }
    }
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        int count = 0;
        for (int i = 0; i < n; i += 2 * k) {
            int end = Math.min(i + k - 1, n - 1);
            reverse(charArray, i, end);
        }
        return new String(charArray);
    }
}
