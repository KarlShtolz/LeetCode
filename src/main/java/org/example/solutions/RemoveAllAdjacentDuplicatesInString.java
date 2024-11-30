package org.example.solutions;

import java.util.Stack;

/**
 * 1047. Remove All Adjacent Duplicates In String
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two
 * adjacent and equal letters and removing them.
 * We repeatedly make duplicate removals on s until we no longer can.
 * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 *
 * Example 1:
 * Input: s = "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only
 * possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final
 * string is "ca".
 *
 * Example 2:
 * Input: s = "azxxzy"
 * Output: "ay"
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        if (s.length() == 1) {
            return s;
        }
        char [] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (st.empty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                st.pop();
            }
        }
        String tmp = "";
        while (!st.empty()) {
            tmp = String.valueOf(st.pop());
            sb = new StringBuilder(tmp).append(sb);
        }
        return sb.toString();
    }
}
