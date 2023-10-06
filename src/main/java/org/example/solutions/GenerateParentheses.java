package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 */

public class GenerateParentheses {
    List<String> answer = new ArrayList();
    public List<String> generateParenthesis(int n) {
        find("",n,n);
        return answer;
    }
    private void find(String s, int a, int b) {
        if (a != 0) find(s + "(", a-1, b);
        if (b != 0 && a < b) find(s + ")", a, b-1);
        if (a == 0 && b == 0) answer.add(s);
    }
}
