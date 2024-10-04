package org.example.solutions;

/**
 * 63. Unique Paths II
 * You are given an m x n integer array grid. There is a robot initially located at the top-left corner
 * (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can
 * only move either down or right at any point in time.
 * An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any
 * square that is an obstacle.
 * Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * The testcases are generated so that the answer will be less than or equal to 2 * 109.
 *
 * Example 1:
 * Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * Output: 2
 * Explanation: There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 *
 * Example 2:
 * Input: obstacleGrid = [[0,1],[0,0]]
 * Output: 1
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int h = obstacleGrid.length;
        int w = obstacleGrid[0].length;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            if (obstacleGrid[i][0] == -1) {
                for (int k = i; k < h; k++) {
                    obstacleGrid[k][0] = -1;
                }
            }
            if (obstacleGrid[i][0] != -1) {
                obstacleGrid[i][0] = 1;
            }
        }
        for (int i = 0; i < w; i++) {
            if (obstacleGrid[0][i] == -1) {
                for (int k = i; k < w; k++) {
                    obstacleGrid[0][k] = -1;
                }
            }
            if (obstacleGrid[0][i] != -1) {
                obstacleGrid[0][i] = 1;
            }
        }
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if (obstacleGrid[i][j] != -1) {
                    if (obstacleGrid[i][j - 1] != -1) {
                        obstacleGrid[i][j] += obstacleGrid[i][j - 1];
                    }
                    if (obstacleGrid[i - 1][j] != -1) {
                        obstacleGrid[i][j] += obstacleGrid[i - 1][j];
                    }
                }
            }
        }
        if (obstacleGrid[h - 1][w - 1] != -1) {
            return obstacleGrid[h - 1][w - 1];
        } else {
            return 0;
        }
    }

    /**
     * only for debug
     * @param obstacleGrid
     */
    public void printMatrixDebug (int[][] obstacleGrid) {
        int h = obstacleGrid.length;
        int w = obstacleGrid[0].length;
        System.out.println("debug_print_start");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(obstacleGrid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("debug_print_end");
    }
}
