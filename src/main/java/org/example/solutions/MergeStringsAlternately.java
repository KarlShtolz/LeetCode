package org.example.solutions;

/**
 * 1768. Merge Strings Alternately
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with
 * word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 *
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 *
 * Example 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 *
 * Example 3:
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        if (word1 == null || word1.isEmpty()) {
            return word2;
        }
        if (word2 == null || word2.isEmpty()) {
            return word1;
        }
        int ptr1 = 0;
        int ptr2 = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (ptr1 != word1.length()) {
                sb.append(word1.charAt(ptr1));
                ptr1++;
            }
            if (ptr2 != word2.length()) {
                sb.append(word2.charAt(ptr2));
                ptr2++;
            }
            if (ptr2 == word2.length() && ptr1 == word1.length()) {
                return sb.toString();
            }
        }
    }
}
