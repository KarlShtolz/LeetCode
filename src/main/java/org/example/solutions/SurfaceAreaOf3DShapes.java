package org.example.solutions;

/**
 * 892. Surface Area of 3D Shapes
 * You are given an n x n grid where you have placed some 1 x 1 x 1 cubes. Each value v = grid[i][j] represents a tower
 * of v cubes placed on top of cell (i, j). After placing these cubes, you have decided to glue any directly adjacent
 * cubes to each other, forming several irregular 3D shapes.
 * Return the total surface area of the resulting shapes.
 * Note: The bottom face of each shape counts toward its surface area.
 *
 * Example 1:
 * Input: grid = [[1,2],[3,4]]
 * Output: 34
 *
 * Example 2:
 * Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: 32
 *
 * Example 3:
 * Input: grid = [[2,2,2],[2,1,2],[2,2,2]]
 * Output: 46
 */
public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result += getArea(grid, i, j);
            }
        }
        return result;
    }
    private int getArea(int[][] grid, int i, int j) {
        int towerHeight = grid[i][j];
        if (towerHeight == 0) {
            return 0;
        }
        int area = 2 + (towerHeight * 4);
        if (i > 0) {
            area -= Math.min(towerHeight, grid[i - 1][j]);
        }
        if (i < grid.length - 1) {
            area -= Math.min(towerHeight, grid[i + 1][j]);
        }
        if (j > 0) {
            area -= Math.min(towerHeight, grid[i][j - 1]);
        }
        if (j < grid[0].length - 1) {
            area -= Math.min(towerHeight, grid[i][j + 1]);
        }
        return area;
    }
}
