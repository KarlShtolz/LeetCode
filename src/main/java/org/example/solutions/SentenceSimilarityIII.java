package org.example.solutions;

/**
 * 1813. Sentence Similarity III
 * You are given two strings sentence1 and sentence2, each representing a sentence composed of words. A sentence is a
 * list of words that are separated by a single space with no leading or trailing spaces. Each word consists of only
 * uppercase and lowercase English characters.
 * Two sentences s1 and s2 are considered similar if it is possible to insert an arbitrary sentence (possibly empty)
 * inside one of these sentences such that the two sentences become equal. Note that the inserted sentence must be
 * separated from existing words by spaces.
 * For example,
 * s1 = "Hello Jane" and s2 = "Hello my name is Jane" can be made equal by inserting "my name is" between "Hello" and
 * "Jane" in s1.
 * s1 = "Frog cool" and s2 = "Frogs are cool" are not similar, since although there is a sentence "s are" inserted into
 * s1, it is not separated from "Frog" by a space. Given two sentences sentence1 and sentence2, return true if sentence1
 * and sentence2 are similar. Otherwise, return false.
 *
 * Example 1:
 * Input: sentence1 = "My name is Haley", sentence2 = "My Haley"
 * Output: true
 * Explanation:
 * sentence2 can be turned to sentence1 by inserting "name is" between "My" and "Haley".
 *
 * Example 2:
 * Input: sentence1 = "of", sentence2 = "A lot of words"
 * Output: false
 * Explanation:
 * No single sentence can be inserted inside one of the sentences to make it equal to the other.
 *
 * Example 3:
 * Input: sentence1 = "Eating right now", sentence2 = "Eating"
 * Output: true
 * Explanation:
 * sentence2 can be turned to sentence1 by inserting "right now" at the end of the sentence.
 */
public class SentenceSimilarityIII {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.equals(sentence2)) return true;
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int s1si = 0, s1ei = s1.length - 1;
        int s2si = 0, s2ei = s2.length - 1;
        while (s1si <= s1ei && s2si <= s2ei && s1[s1si].equals(s2[s2si])) {
            s1si++;
            s2si++;
        }
        while (s1ei >= s1si && s2ei >= s2si && s1[s1ei].equals(s2[s2ei])) {
            s1ei--;
            s2ei--;
        }
        return s1ei < s1si || s2ei < s2si;
    }
}
