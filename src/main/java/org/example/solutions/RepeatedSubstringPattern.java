package org.example.solutions;

/**
 * 459. Repeated Substring Pattern
 * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the
 * substring together.
 *
 * Example 1:
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 *
 * Example 2:
 * Input: s = "aba"
 * Output: false
 *
 * Example 3:
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        String substr = "";
        int n = s.length();
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                substr = s.substring(0, i);
                if(s.replaceAll(substr, "").isEmpty())
                    return true;
            }
        }
        return false;
    }
}
