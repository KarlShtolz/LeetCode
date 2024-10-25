package org.example.solutions;

import java.util.*;

/**
 * 118. Pascal's Triangle
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        if (numRows == 1) {
            List<List<Integer>> answer = new ArrayList<>();
            answer.add(List.of(1));
            return answer;
        }
        List<List<Integer>> answer = generate(numRows - 1);
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            tmp.add(1);
        }
        for (int i = 1; i < numRows - 1; i++) {
            tmp.set(i, answer.get(numRows - 2).get(i - 1) + answer.get(numRows - 2).get(i));
        }
        answer.add(tmp);
        return answer;
    }
    public List<List<Integer>> generateNoRecursion(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }
}
