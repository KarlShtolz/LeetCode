package org.example.solutions;

import java.util.Stack;

/**
 * 32. Longest Valid Parentheses
 * Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses
 * substring
 * .
 * Example 1:
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 *
 * Example 2:
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 *
 * Example 3:
 * Input: s = ""
 * Output: 0
 */

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int res=0;
        for(int i=0, pv=0;i<s.length(); ++i) {
            if(s.charAt(i)=='(') stack.push(pv);
            else if(!stack.isEmpty()){
                res=Math.max(res, i - (pv=stack.pop()) + 1);
                continue;
            }
            pv=i+1;
        }
        return res;
    }
}
