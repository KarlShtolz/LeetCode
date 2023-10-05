package org.example.solutions;

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
}
