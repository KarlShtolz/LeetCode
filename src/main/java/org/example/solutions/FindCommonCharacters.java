package org.example.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1002. Find Common Characters
 * Given a string array words, return an array of all characters that show up in all strings within the words (including
 * duplicates). You may return the answer in any order.
 *
 * Example 1:
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 *
 * Example 2:
 * Input: words = ["cool","lock","cook"]
 * Output: ["c","o"]
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            int minCount = Integer.MAX_VALUE;
            for (String word : words) {
                int count = 0;
                for (char ch : word.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
                if (minCount == 0) {
                    break;
                }
            }
            for (int i = 0; i < minCount; i++) {
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
}
