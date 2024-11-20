package org.example.solutions;

import java.util.ArrayList;

/**
 * 917. Reverse Only Letters
 * Given a string s, reverse the string according to the following rules:
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * Return s after reversing it.
 *
 * Example 1:
 * Input: s = "ab-cd"
 * Output: "dc-ba"
 *
 * Example 2:
 * Input: s = "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 *
 * Example 3:
 * Input: s = "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char [] arrStart = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int l = arrStart.length;
        int t2 = l - 1;
        for (char c : arrStart) {
            if (!Character.isLetter(c)) {
                sb.append(c);
            }
            if (Character.isLetter(c)) {
                while (!Character.isLetter(arrStart[t2])) {
                    if (t2 != 0) {
                        t2--;
                    }
                }
                sb.append(arrStart[t2]);
                if (t2 != 0) {
                    t2--;
                }
            }
        }
        return sb.toString();
    }
}
