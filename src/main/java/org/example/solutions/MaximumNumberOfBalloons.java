package org.example.solutions;

/**
 * 1189. Maximum Number of Balloons
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as
 * possible. You can use each character in text at most once. Return the maximum number of instances that can be formed.
 *
 * Example 1:
 * Input: text = "nlaebolko"
 * Output: 1
 *
 * Example 2:
 * Input: text = "loonbalxballpoon"
 * Output: 2
 *
 * Example 3:
 * Input: text = "leetcode"
 * Output: 0
 */
public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons (String text) {
        char [] textArr = text.toCharArray();
        int [] chars = new int[5];
        int tmp = 0;
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i] == 'b') {
                chars[0]++;
            } else if (textArr[i] == 'a') {
                chars[1]++;
            } else if (textArr[i] == 'l') {
                chars[2]++;
            } else if (textArr[i] == 'o') {
                chars[3]++;
            } else if (textArr[i] == 'n') {
                chars[4]++;
            }
        }
        while (chars[0] >= 1 && chars[1] >= 1 && chars[2] >= 2 && chars[3] >= 2 && chars[4] >= 1) {
            tmp++;
            chars[0]--;
            chars[1]--;
            chars[2]--;
            chars[2]--;
            chars[3]--;
            chars[3]--;
            chars[4]--;
        }
        return tmp;
    }
}
