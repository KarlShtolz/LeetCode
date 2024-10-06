package org.example.solutions;

/**
 * 567. Permutation in String
 * Given two strings s1 and s2, return true if s2 contains a
 * permutation
 *  of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 *
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (containPermutation(s1, s2, i)) {
                return true;
            }
        }
        return false;
    }
    public boolean containPermutation (String a1, String a2, int index) {
        if (index + a1.length() > a2.length()) {
            return false;
        }
        int lenAlphabet = 150;
        int [] alphabet = new int[lenAlphabet];
        int tmp = 0;
        for (int i = 0; i < a1.length(); i++) {
            tmp = (int) a1.charAt(i);
            alphabet[tmp] = alphabet[tmp] + 1;
        }
        for (int i = index; i < a1.length() + index; i++) {
            tmp = (int) a2.charAt(i);
            alphabet[tmp] = alphabet[tmp] - 1;
        }
        for (int i = 0; i < lenAlphabet; i++) {
            if (alphabet[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
