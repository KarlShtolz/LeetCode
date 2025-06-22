package org.example.solutions;

/**
 * 498. Diagonal Traverse
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 *
 * Example 1:
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,4,7,5,3,6,8,9]
 *
 * Example 2:
 * Input: mat = [[1,2],[3,4]]
 * Output: [1,2,3,4]
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int [] ans;
        if (mat.length == 1 && mat[0].length == 1) {
            return new int[]{mat[0][0]};
        }
        if (mat[0].length == 1) {
            ans = new int[mat.length];
            for (int i = 0; i < mat.length; i++) {
                ans[i] = mat[i][0];
            }
            return ans;
        }
        if (mat.length == 1) {
            ans = new int[mat[0].length];
            for (int i = 0; i < mat[0].length; i++) {
                ans[i] = mat[0][i];
            }
            return ans;
        }
        int len = mat.length * mat[0].length;
        ans = new int[len];
        int h = 0;
        int w = 0;
        int flag = 0;
        for (int i = 0; i < len; i++) {
            ans[i] = mat[h][w];
            if (h == 0 && w == 0) {
                w++;
                flag = -1;
            } else if (h == 0 && flag == 1) {
                flag = -1;
                if (w == mat[0].length - 1) {
                    h++;
                } else {
                    w++;
                }
            } else if (w == 0 && flag == -1) {
                flag = 1;
                if (h == mat.length - 1) {
                    w++;
                } else {
                    h++;
                }
            } else if (h == mat.length - 1 && flag == -1) {
                w++;
                flag = 1;
            } else if (w == mat[0].length - 1 && flag == 1) {
                h++;
                flag = -1;
            } else {
                if (flag == -1) {
                    h++;
                    w--;
                } else {
                    h--;
                    w++;
                }
            }
        }
        return ans;
    }
}
