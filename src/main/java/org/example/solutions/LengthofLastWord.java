package org.example.solutions;

/**
 * 58. Length of Last Word
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 *
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 *
 * Example 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 *
 * Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1) {
            return 1;
        }
        s = ' ' + s + ' ';
        int lastCharIndex = s.length() - 1;
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) != ' ') {
                lastCharIndex = j;
                break;
            }
        }
        for (int i = lastCharIndex; i >= 0; i--) {
            if (s.charAt(i) == ' ' || i == 0) {
                if (lastCharIndex == 0 && i == 0) {
                    return 1;
                } else {
                    return lastCharIndex - i;
                }

            }
        }
        return -1;
    }
}
