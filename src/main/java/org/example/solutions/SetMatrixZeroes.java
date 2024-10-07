package org.example.solutions;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * 73. Set Matrix Zeroes
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 * You must do it in place.
 *
 * Example 1:
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 *
 * Example 2:
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */

public class SetMatrixZeroes {
    //10 ms, 45.5 MB
    public void setZeroes(int[][] matrix) {
        int flag = 123456;
        int h = matrix.length;
        int w = matrix[0].length;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < w; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = flag;
                        }
                    }
                    for (int k = 0; k < h; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = flag;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j] == flag) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.print(Arrays.deepToString(matrix).replace(" ", ""));
    }
//39 ms, 45.7 MB
//    public void setZeroes(int[][] matrix) {
//        int h = matrix.length;
//        int w = matrix[0].length;
//        ArrayList<Integer> x0 = new ArrayList<>();
//        ArrayList<Integer> y0 = new ArrayList<>();
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                if (matrix[i][j] == 0) {
//                    x0.add(j);
//                    y0.add(i);
//                }
//            }
//        }
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                if (x0.contains(j)) {
//                    matrix[i][j] = 0;
//                }
//                if (y0.contains(i)) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//        System.out.print(Arrays.deepToString(matrix).replace(" ", ""));
//    }
}
