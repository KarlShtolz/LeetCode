package org.example.solutions;

/**
 * 463. Island Perimeter
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents
 * water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
 * and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes", meaning
 * the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid
 * is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 *
 * Example 1:
 * Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 * Output: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image above.
 *
 * Example 2:
 * Input: grid = [[1]]
 * Output: 4
 *
 * Example 3:
 * Input: grid = [[1,0]]
 * Output: 4
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int h = grid.length;
        int w = grid[0].length;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == 1) {
                    count += getCountBorder(grid, i, j);
                }
            }
        }
        return count;
    }
    public int getCountBorder (int [][] grid, int i, int j) {
        int h = grid.length;
        int w = grid[0].length;
        int count = 0;
        if (j != w - 1 && grid[i][j + 1] == 0) count++;
        if (j != 0 && grid[i][j - 1] == 0) count++;
        if (i != h - 1 && grid[i + 1][j] == 0) count++;
        if (i != 0 && grid[i - 1][j] == 0) count++;
        if (i == 0) count++;
        if (j == 0) count++;
        if (j == w - 1) count++;
        if (i == h - 1) count++;
        return count;
    }
}
