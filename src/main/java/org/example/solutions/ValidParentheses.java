package org.example.solutions;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 */
public class ValidParentheses {
    /**
     * no Stack
     * using Pointer
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        int pointer = 0;
        char [] arr = s.toCharArray();
        if (arr[0] == ')' || arr[0] == ']' || arr[0] == '}') {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (pointer < 0) {
                return false;
            }
            if (arr[i] == '(') {
                arr[pointer] = '(';
                pointer++;
            }
            if (arr[i] == '[') {
                arr[pointer] = '[';
                pointer++;
            }
            if (arr[i] == '{') {
                arr[pointer] = '{';
                pointer++;
            }
            if (arr[i] == ')') {
                if (pointer - 1 < 0) {
                    return false;
                }
                if (arr[pointer - 1] != '(') {
                    return false;
                }
                pointer--;
            }
            if (arr[i] == ']') {
                if (pointer - 1 < 0) {
                    return false;
                }
                if (arr[pointer - 1] != '[') {
                    return false;
                }
                pointer--;
            }
            if (arr[i] == '}') {
                if (pointer - 1 < 0) {
                    return false;
                }
                if (arr[pointer - 1] != '{') {
                    return false;
                }
                pointer--;
            }
        }
        if (pointer != 0) {
            return false;
        }
        return true;
    }
    /**
     * using Stack
     * @param s
     * @return
     */
    public boolean isValidStack(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char [] arr = s.toCharArray();
        if (arr[0] == ')' || arr[0] == ']' || arr[0] == '}') {
            return false;
        }
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                st.push(arr[i]);
            }
            if (arr[i] == ')') {
                if (st.empty()) {
                    return false;
                }
                if (st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            }
            if (arr[i] == ']') {
                if (st.empty()) {
                    return false;
                }
                if (st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
            if (arr[i] == '}') {
                if (st.empty()) {
                    return false;
                }
                if (st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.empty() == false) {
            return false;
        }
        return true;
    }
}
