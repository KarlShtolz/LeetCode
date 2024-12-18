package org.example.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * 1380. Lucky Numbers in a Matrix
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 *
 * Example 1:
 * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * Output: [15]
 * Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
 *
 * Example 2:
 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * Output: [12]
 * Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
 *
 * Example 3:
 * Input: matrix = [[7,8],[1,2]]
 * Output: [7]
 * Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
 */
public class LuckyNumbersInAMatrix {
    int h;
    int w;
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lst = new LinkedList<Integer>();
        h = matrix.length;
        w = matrix[0].length;

        int [] colMax = findColMax(matrix);
        int [] rowsMin = findRowsMin(matrix);
        for (int i = 0; i < colMax.length; i++) {
            for (int j = 0; j < rowsMin.length; j++) {
                if (colMax[i] == rowsMin[j]) {
                    lst.add(colMax[i]);
                }
            }
        }
        return lst;
    }
    public int[] findColMax (int[][] a) {
        int max = Integer.MIN_VALUE;
        int [] arr = new int[w];
        for (int j = 0; j < w; j++) {
            for (int i = 0; i < h; i++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            arr[j] = max;
            max = Integer.MIN_VALUE;
        }
        return arr;
    }
    public int[] findRowsMin (int[][] a) {
        int min = Integer.MAX_VALUE;
        int [] arr = new int[h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
            arr[i] = min;
            min = Integer.MAX_VALUE;
        }
        return arr;
    }
}
