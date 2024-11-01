package org.example.solutions;

/**
 * 1957. Delete Characters to Make Fancy String
 * A fancy string is a string where no three consecutive characters are equal.
 * Given a string s, delete the minimum possible number of characters from s to make it fancy.
 * Return the final string after the deletion. It can be shown that the answer will always be unique.
 *
 * Example 1:
 * Input: s = "leeetcode"
 * Output: "leetcode"
 * Explanation:
 * Remove an 'e' from the first group of 'e's to create "leetcode".
 * No three consecutive characters are equal, so return "leetcode".
 *
 * Example 2:
 * Input: s = "aaabaaaa"
 * Output: "aabaa"
 * Explanation:
 * Remove an 'a' from the first group of 'a's to create "aabaaaa".
 * Remove two 'a's from the second group of 'a's to create "aabaa".
 * No three consecutive characters are equal, so return "aabaa".
 *
 * Example 3:
 * Input: s = "aab"
 * Output: "aab"
 * Explanation: No three consecutive characters are equal, so return "aab".
 */
public class DeleteCharactersToMakeFancyString {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() < 3) {
            return s;
        }
        if (s.length() == 3) {
            if (s.charAt(0) != s.charAt(1) || s.charAt(1) != s.charAt(2)) {
                return s;
            } else {
                sb.append(s.charAt(0));
                sb.append(s.charAt(2));
                return sb.toString();
            }
        }
        char a0 = s.charAt(0);
        char a1 = s.charAt(1);
        sb.append(a0);
        sb.append(a1);
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == a0 && s.charAt(i) == a1) {
                continue;
            }
            if (s.charAt(i) == a1 && s.charAt(i) != a0) {
                sb.append(s.charAt(i));
                a0 = a1;
                a1 = s.charAt(i);
            }
            if (s.charAt(i) != a1 && s.charAt(i) != a0) {
                sb.append(s.charAt(i));
                a0 = a1;
                a1 = s.charAt(i);
            }
            if (s.charAt(i) != a1 && s.charAt(i) == a0) {
                sb.append(s.charAt(i));
                a0 = a1;
                a1 = s.charAt(i);
            }
        }
        return sb.toString();
    }
}
