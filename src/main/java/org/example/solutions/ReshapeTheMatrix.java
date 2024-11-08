package org.example.solutions;

/**
 * 566. Reshape the Matrix
 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different
 * size r x c keeping its original data.
 * You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns
 * of the wanted reshaped matrix.
 * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order
 * as they were.
 * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise,
 * output the original matrix.
 *
 * Example 1:
 * Input: mat = [[1,2],[3,4]], r = 1, c = 4
 * Output: [[1,2,3,4]]
 *
 * Example 2:
 * Input: mat = [[1,2],[3,4]], r = 2, c = 4
 * Output: [[1,2],[3,4]]
 */
public class ReshapeTheMatrix {
    int iF = 0;
    int jF = 0;
    int rOrigin;
    int cOrigin;
    int iN = 0;
    int jN = 0;
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [] ansGetNExtElem = new int[2];
        rOrigin = mat.length;
        cOrigin = mat[0].length;
        if (r * c != rOrigin * cOrigin) {
            return mat;
        }
        int [][] newMat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                getNextElem();
                newMat[i][j] = mat[iN][jN];
            }
        }
        return newMat;
    }
    public void getNextElem () {
        iN = iF;
        jN = jF;
        if (jF != cOrigin - 1) {
            jF++;
        } else {
            iF++;
            jF = 0;
        }
    }
}
