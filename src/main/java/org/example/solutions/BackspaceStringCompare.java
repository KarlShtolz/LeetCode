package org.example.solutions;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 844. Backspace String Compare
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a
 * backspace character.
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1:
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 *
 * Example 2:
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 *
 * Example 3:
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 */

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        char [] arrS = s.toCharArray();
        char [] arrT = t.toCharArray();
        if (getResultBackspace(arrS).equals(getResultBackspace(arrT))) {
            return true;
        }
        return false;
    }
    public String getResultBackspace (char [] s) {
        ArrayList<Character> lst = new ArrayList<Character>();
        int size = lst.size();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '#') {
                if (i != 0) {
                    size = lst.size();
                    if (size >= 1) {
                        lst.remove(size - 1);
                    }
                }
            } else {
                lst.add(s[i]);
            }
        }
        return lst.toString();
    }
/**
 * use Stack
 */
//    public boolean backspaceCompare(String s, String t) {
//        Stack<Character> st1 = new Stack<>();
//        Stack<Character> st2 = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != '#') {
//                st1.push(s.charAt(i));
//            } else {
//                if (!st1.isEmpty()) {
//                    st1.pop();
//                }
//            }
//        }
//        for (int i = 0; i < t.length(); i++) {
//            if (t.charAt(i) != '#') {
//                st2.push(t.charAt(i));
//            } else {
//                if (!st2.isEmpty()) {
//                    st2.pop();
//                }
//            }
//        }
//        return st1.toString().equals(st2.toString());
//    }
}
