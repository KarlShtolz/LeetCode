package org.example.solutions;

import java.util.ArrayList;

/**
 * 290. Word Pattern
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * Specifically:
 *      Each letter in pattern maps to exactly one unique word in s.
 *      Each unique word in s maps to exactly one letter in pattern.
 *      No two letters map to the same word, and no two words map to the same letter.
 *
 * Example 1:
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Explanation:
 * The bijection can be established as:
 * 'a' maps to "dog".
 * 'b' maps to "cat".
 *
 * Example 2:
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 *
 * Example 3:
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String [] arr = s.split(" ");
        if (pattern.length() != arr.length) {return false;}
        ArrayList<Character> arrChar = new ArrayList<>();
        ArrayList<String> arrStr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arrChar.contains(pattern.charAt(i))) {
                arrChar.add(pattern.charAt(i));
                if (arrStr.contains(arr[i])) {return false;}
                arrStr.add(arr[i]);
            } else {
                if (!arr[i].equals(arrStr.get(arrChar.indexOf(pattern.charAt(i))))) {return false;}
            }
        }
        return true;
    }
}
