package org.example.solutions;

import java.util.ArrayList;
import java.util.Arrays;

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
    /**
     * 5 ms, 45.24 MB
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char tmp = '_';
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                arrayList.add(i);
            }
        }
        for (int i = 0; i < arrayList.size() / 2; i++) {
            p1 = i;
            p2 = arrayList.size() - 1 - i;
            tmp = arr[arrayList.get(p1)];
            arr[arrayList.get(p1)] = arr[arrayList.get(p2)];
            arr[arrayList.get(p2)] = tmp;
        }
        for (int i = 0; i < s.length(); i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    /**
     * 5 ms, 44.73 MB
     * @param s
     * @return
     */
    public String reverseVowelsBrutForce(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
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
