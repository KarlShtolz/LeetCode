package org.example.solutions;

/**
 * 387. First Unique Character in a String
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Explanation:
 * The character 'l' at index 0 is the first character that does not occur at any other index.
 *
 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2
 *
 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        /**
         O(n*n)
         */
        if (s == null || s.length() == 0) {
            return -1;
        }
        int l = s.length();
        char [] sArr = s.toCharArray();
        int flag = -1;
        int tmp = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (j != i && sArr[i] == sArr[j]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == -1) {
                return i;
            }
            flag = -1;
        }
        return -1;
    }
}
