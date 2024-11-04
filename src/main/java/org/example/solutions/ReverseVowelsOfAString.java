package org.example.solutions;

/**
 * 345. Reverse Vowels of a String
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 * Example 1:
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 * Explanation:
 * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 *
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        char tmp = '_';
        char tmp1 = '_';
        for (int i = 0; i < s.length(); i++) {
            tmp1 = s.charAt(i);
            if (tmp1 == 'a' || tmp1 == 'e' || tmp1 == 'i' || tmp1 == 'o' || tmp1 == 'u' ||
                    tmp1 == 'A' || tmp1 == 'E' || tmp1 == 'I' || tmp1 == 'O' || tmp1 == 'U') {
                sb2.append(tmp1);
                sb1.append('_');
            } else {
                sb1.append(tmp1);
            }
        }
        String sb1String = sb1.toString();
        String sb2String = sb2.toString();
        String s1 = sb2.reverse().toString();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sb1String.charAt(i) == '_') {
                sb3.append(s1.charAt(j));
                j++;
            } else {
                sb3.append(s.charAt(i));
            }
        }
        return sb3.toString();
    }
}
