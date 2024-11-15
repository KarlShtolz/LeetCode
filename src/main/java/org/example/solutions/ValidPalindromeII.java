package org.example.solutions;

/**
 * 680. Valid Palindrome II
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 * Example 1:
 * Input: s = "aba"
 * Output: true
 *
 * Example 2:
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 *
 * Example 3:
 * Input: s = "abc"
 * Output: false
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        return palindromeCheck(s, 0, s.length() - 1, 0);
    }
    public boolean palindromeCheck(String s, int l, int r, int deletions) {
        if (deletions > 1) {
            return false;
        }
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return palindromeCheck(s, l + 1, r, deletions + 1) ||
                        palindromeCheck(s, l, r - 1, deletions + 1);
            }
            l++;
            r--;
        }
        return true;
    }
}
