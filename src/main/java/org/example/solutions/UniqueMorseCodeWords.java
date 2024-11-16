package org.example.solutions;

import java.util.HashSet;

/**
 * 804. Unique Morse Code Words
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * as follows:
 *      'a' maps to ".-",
 *      'b' maps to "-...",
 *      'c' maps to "-.-.", and so on.
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
 * "-","..-","...-",".--","-..-","-.--","--.."]
 * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will
 * call such a concatenation the transformation of a word.
 * Return the number of different transformations among all words we have.
 *
 * Example 1:
 * Input: words = ["gin","zen","gig","msg"]
 * Output: 2
 * Explanation: The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * There are 2 different transformations: "--...-." and "--...--.".
 *
 * Example 2:
 * Input: words = ["a"]
 * Output: 1
 */
public class UniqueMorseCodeWords {
    static String[] alphabets = {".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..","--","-.","---",
            ".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
            "-.--","--.."};
    public String morse(String word){
        StringBuilder str = new StringBuilder();
        for(int j = 0; j < word.length(); ++j){
            str.append(alphabets[word.charAt(j) - 'a']);
        }
        return str.toString();
    }
    public int uniqueMorseRepresentations(String[] words) {
        var uniques = new HashSet<String>();
        for (String word : words) uniques.add(morse(word));
        return uniques.size();
    }
}
