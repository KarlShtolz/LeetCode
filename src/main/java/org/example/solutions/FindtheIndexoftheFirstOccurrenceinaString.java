package org.example.solutions;

/**
 * 28. Find the Index of the First Occurrence in a String
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 *
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        int place = -1;
        int lenStr = haystack.length();
        int lenSubStr = needle.length();
        if (lenStr == 0 || lenSubStr == 0 || lenSubStr > lenStr) {
            return place;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i < (lenStr - lenSubStr + 1); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (check(i, haystack, needle)) {
                    return i;
                }
            }
        }
        return place;
    }
    public boolean check(int ind, String str, String subStr) {
        for (int i = 0; i < subStr.length(); i++) {
            if (subStr.charAt(i) != str.charAt(i+ind)) {
                return false;
            }
        }
        return true;
    }
}
