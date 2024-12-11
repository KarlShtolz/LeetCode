package org.example.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * 1260. Shift 2D Grid
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
 * In one shift operation:
 *     Element at grid[i][j] moves to grid[i][j + 1].
 *     Element at grid[i][n - 1] moves to grid[i + 1][0].
 *     Element at grid[m - 1][n - 1] moves to grid[0][0].
 *     Return the 2D grid after applying shift operation k times.
 *
 * Example 1:
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
 * Output: [[9,1,2],[3,4,5],[6,7,8]]
 *
 * Example 2:
 * Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
 * Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
 *
 * Example 3:
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
 * Output: [[1,2,3],[4,5,6],[7,8,9]]
 */
public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int h = grid.length;
        int w = grid[0].length;
        int len = h * w;
        int fl = 0;
        k = k % len;
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        List<Integer> tmp = new LinkedList<Integer>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                fl++;
                if (fl >= len - k + 1) {
                    tmp.add(grid[i][j]);
                    if (tmp.size() == w) {
                        ans.add(tmp);
                        tmp = new LinkedList<Integer>();
                    }
                }
            }
        }
        fl = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                fl++;
                if (fl < len - k + 1) {
                    tmp.add(grid[i][j]);
                    if (tmp.size() == w) {
                        ans.add(tmp);
                        tmp = new LinkedList<Integer>();
                    }
                }
            }
        }
        return ans;
    }
}
