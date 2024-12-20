package org.example.solutions;

import java.util.ArrayList;

/**
 * 884. Uncommon Words from Two Sentences
 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 * Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
 *
 * Example 1:
 * Input: s1 = "this apple is sweet", s2 = "this apple is sour"
 * Output: ["sweet","sour"]
 * Explanation:
 * The word "sweet" appears only in s1, while the word "sour" appears only in s2.
 *
 * Example 2:
 * Input: s1 = "apple apple", s2 = "banana"
 * Output: ["banana"]
 */
public class UncommonWordsFromTwoSentences {
    public String [] uncommonFromSentences(String s1, String s2) {
        String [] word = s1.split(" ");
        String [] word2 = s2.split(" ");
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> exit = new ArrayList<>();
        for (String s: word) {
            if (result.contains(s)) {
                result.remove(s);
                exit.add(s);
            } else if (!exit.contains(s)) {
                result.add(s);
            }
        }
        for (String s:word2){
            if (result.contains(s)) {
                result.remove(s);
                exit.add(s);
            } else if (!exit.contains(s)) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
}
