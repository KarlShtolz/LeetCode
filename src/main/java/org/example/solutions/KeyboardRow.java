package org.example.solutions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 500. Keyboard Row
 * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of
 * American keyboard like the image below.
 * In the American keyboard:
 *     the first row consists of the characters "qwertyuiop",
 *     the second row consists of the characters "asdfghjkl", and
 *     the third row consists of the characters "zxcvbnm".
 *
 * Example 1:
 * Input: words = ["Hello","Alaska","Dad","Peace"]
 * Output: ["Alaska","Dad"]
 *
 * Example 2:
 * Input: words = ["omk"]
 * Output: []
 *
 * Example 3:
 * Input: words = ["adsdf","sfd"]
 * Output: ["adsdf","sfd"]
 */
public class KeyboardRow {
    ArrayList<Character> str1 = new ArrayList<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
    ArrayList<Character> str2 = new ArrayList<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
    ArrayList<Character> str3 = new ArrayList<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
    public String[] findWords(String[] words) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String word : words) {
            if (isContainOneLine(word.toLowerCase())) {
                arrayList.add(word);
            }
        }
        String [] ans = new String[arrayList.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arrayList.get(i);
        }
        return ans;
    }
    public boolean isContainOneLine (String str) {
        var s1 = 0;
        var s2 = 0;
        var s3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str1.contains(str.charAt(i))) {
                s1 = 1;
                if (s1 + s2 + s3 > 1) {
                    return false;
                }
            }
            if (str2.contains(str.charAt(i))) {
                s2 = 1;
                if (s1 + s2 + s3 > 1) {
                    return false;
                }
            }
            if (str3.contains(str.charAt(i))) {
                s3 = 1;
                if (s1 + s2 + s3 > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
