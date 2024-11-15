package org.example.solutions;

/**
 * 392. Is Subsequence
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a
 * subsequence of "abcde" while "aec" is not).
 *
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 *
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        int pointer1 = 0;
        int pointer2 = 0;
        for (pointer1 = 0; pointer1 < t.length(); pointer1++) {
            if (pointer2 == s.length() - 1 && t.charAt(pointer1) == s.charAt(pointer2)) {
                return true;
            }
            if (s.charAt(pointer2) == t.charAt(pointer1)) {
                pointer2++;
            }
        }
        return false;
    }
}
