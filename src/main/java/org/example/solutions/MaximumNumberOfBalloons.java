package org.example.solutions;

import java.util.HashSet;
import java.util.Set;

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
    /**
     * using functional programming patterns
     * @param text
     * @return
     */
    public int maxNumberOfBalloons(String text) {
        int [] alphabet;
        String find = "balloon";
        Set<Integer> set = initSet(find);
        alphabet = incrementAlphabetCounters(text, set);
        int ans = getCountStringInChars(find, alphabet);
        return ans;
    }
    public int getCountStringInChars (String find, int [] alphabet) {
        int count = 0;
        int tmp;
        while (true) {
            for (int i = 0; i < find.length(); i++) {
                tmp = --alphabet[find.charAt(i)];
                if (tmp < 0) {
                    return count;
                }
            }
            count++;
        }
    }
    public Set<Integer> initSet (String s) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add((int) s.charAt(i));
        }
        return set;
    }
    public int[] incrementAlphabetCounters (String t, Set<Integer> set) {
        char [] arrT = t.toCharArray();
        int [] alph = new int[500];
        int tmp = 0;
        for (int i = 0; i < arrT.length; i++) {
            tmp = arrT[i];
            if (set.contains(tmp)) {
                alph[tmp]++;
            }
        }
        return alph;
    }
/**
 * easy way
 */
//    public int maxNumberOfBalloons (String text) {
//        char [] textArr = text.toCharArray();
//        int [] chars = new int[5];
//        int tmp = 0;
//        for (int i = 0; i < textArr.length; i++) {
//            if (textArr[i] == 'b') {
//                chars[0]++;
//            } else if (textArr[i] == 'a') {
//                chars[1]++;
//            } else if (textArr[i] == 'l') {
//                chars[2]++;
//            } else if (textArr[i] == 'o') {
//                chars[3]++;
//            } else if (textArr[i] == 'n') {
//                chars[4]++;
//            }
//        }
//        while (chars[0] >= 1 && chars[1] >= 1 && chars[2] >= 2 && chars[3] >= 2 && chars[4] >= 1) {
//            tmp++;
//            chars[0]--;
//            chars[1]--;
//            chars[2]--;
//            chars[2]--;
//            chars[3]--;
//            chars[3]--;
//            chars[4]--;
//        }
//        return tmp;
//    }
}
