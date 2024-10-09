package org.example.solutions;

/**
 * 921. Minimum Add to Make Parentheses Valid
 * A parentheses string is valid if and only if:
 * It is the empty string,
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
 *
 * For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
 * Return the minimum number of moves required to make s valid.
 *
 * Example 1:
 * Input: s = "())"
 * Output: 1
 *
 * Example 2:
 * Input: s = "((("
 * Output: 3
 */
public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c1++;
            } else {
                c1--;
                if (c1 < 0) {
                    c2++;
                    c1 = 0;
                }
            }
        }
        return c2 + c1;
    }
}
