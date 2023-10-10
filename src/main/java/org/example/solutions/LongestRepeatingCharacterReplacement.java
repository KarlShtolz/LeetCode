package org.example.solutions;

/**
 * 424. Longest Repeating Character Replacement
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other
 * uppercase English character. You can perform this operation at most k times.
 * Return the length of the longest substring containing the same letter you can get after performing the above
 * operations.
 *
 * Example 1:
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 *
 * Example 2:
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * There may exists other ways to achive this answer too.
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int largestCount = 0, beg = 0, maxlen = 0;
        for(int end = 0; end < s.length(); end ++){
            arr[s.charAt(end) - 'A']++;
            largestCount = Math.max(largestCount, arr[s.charAt(end) - 'A']);
            if(end - beg + 1 - largestCount > k){
                arr[s.charAt(beg) - 'A']--;
                beg ++;
            }
            maxlen = Math.max(maxlen, end - beg + 1);
        }
        return maxlen;
    }
}
