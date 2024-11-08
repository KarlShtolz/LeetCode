package org.example.solutions;

/**
 * 520. Detect Capital
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *     All letters in this word are capitals, like "USA".
 *     All letters in this word are not capitals, like "leetcode".
 *     Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 *
 * Example 1:
 * Input: word = "USA"
 * Output: true
 *
 * Example 2:
 * Input: word = "FlaG"
 * Output: false
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        var allUpper = true;
        var firstCap = false;
        var allLower = true;
        if (Character.isUpperCase(word.charAt(0))) {
            firstCap = true;
        }
        for (int i = 1; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                allUpper = false;
            }
            if (Character.isUpperCase(word.charAt(i))) {
                allLower = false;
            }
            if (!allLower && !allUpper) {
                break;
            }
        }
        if (firstCap && allLower) {
            return true;
        } else if (firstCap && allUpper) {
            return true;
        } else if (!allUpper && !allLower) {
            return false;
        } else if (!firstCap && !allUpper && !allLower) {
            return false;
        } else if (!firstCap && !allLower) {
            return false;
        } else {
            return true;
        }
    }
}
