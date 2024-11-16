package org.example.solutions;

/**
 * 859. Buddy Strings
 * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise,
 * return false. Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping
 * the characters at s[i] and s[j].
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 *
 * Example 1:
 * Input: s = "ab", goal = "ba"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
 *
 * Example 2:
 * Input: s = "ab", goal = "ab"
 * Output: false
 * Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
 *
 * Example 3:
 * Input: s = "aa", goal = "aa"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
 */
public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal) && !containEqualChar(s)) {
            return false;
        }
        int countDifferent = 0;
        int flagFirst = 0;
        int flagTrade = 0;
        char c1 = 0;
        char c2;
        char m1 = 0;
        char m2;
        for (int i = 0; i < s.length(); i++) {
            if (flagTrade > 1) {
                return false;
            }
            if (s.charAt(i) != goal.charAt(i)) {
                countDifferent++;
                if (flagFirst == 0) {
                    c1 = s.charAt(i);
                    m1 = goal.charAt(i);
                    flagFirst++;
                } else if (flagFirst == 1) {
                    c2 = s.charAt(i);
                    m2 = goal.charAt(i);
                    flagFirst++;
                    if (c2 == m1 && c1 == m2) {
                        flagTrade++;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (flagFirst == 1) {
            return false;
        }
        return countDifferent <= 2;
    }
    public boolean containEqualChar(String str) {
        int [] alp = new int[140];
        for (int i = 0; i < str.length(); i++) {
            alp[str.charAt(i)]++;
        }
        for (int j : alp) {
            if (j >= 2) {
                return true;
            }
        }
        return false;
    }
}
