package org.example.solutions;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int [] arr1 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr1[(int) s.charAt(i)] ++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr1[(int) t.charAt(i)] --;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
