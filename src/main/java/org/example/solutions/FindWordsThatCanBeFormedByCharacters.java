package org.example.solutions;

/**
 * 1160. Find Words That Can Be Formed by Characters
 * You are given an array of strings words and a string chars.
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 * Return the sum of lengths of all good strings in words.
 *
 * Example 1:
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 *
 * Example 2:
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */
public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int summa = 0;
        int [] alphabet;
        for (String word : words) {
            alphabet = incrementAlphabetFromChars(chars);
            alphabet = decrementAlphabetFromWord(alphabet, word);
            if (checkAlphabet(alphabet)) {
                summa += word.length();
            }
        }
        return summa;
    }
    public int[] incrementAlphabetFromChars (String chars) {
        int [] alphabet = new int[500];
        int tmp;
        for (int i = 0; i < chars.length(); i++) {
            tmp = chars.charAt(i);
            alphabet[tmp]++;
        }
        return alphabet;
    }
    public int[] decrementAlphabetFromWord(int [] alphabet, String chars) {
        int tmp;
        for (int i = 0; i < chars.length(); i++) {
            tmp = chars.charAt(i);
            alphabet[tmp]--;
        }
        return alphabet;
    }
    public boolean checkAlphabet(int [] alphabet) {
        for (int j : alphabet) {
            if (j < 0) {
                return false;
            }
        }
        return true;
    }
}
