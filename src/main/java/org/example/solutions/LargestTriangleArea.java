package org.example.solutions;

/**
 * 812. Largest Triangle Area
 * Given an array of points on the X-Y plane points where points[i] = [xi, yi], return the area of the largest triangle
 * that can be formed by any three different points. Answers within 10-5 of the actual answer will be accepted.
 *
 * Example 1:
 * Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
 * Output: 2.00000
 * Explanation: The five points are shown in the above figure. The red triangle is the largest.
 *
 * Example 2:
 * Input: points = [[1,0],[0,0],[0,1]]
 * Output: 0.50000
 */
public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    ans = Math.max(ans, 0.5 * Math.abs(points[i][0] * (points[j][1] - points[k][1]) + points[j][0] *
                            (points[k][1] - points[i][1]) + points[k][0] * (points[i][1] - points[j][1])));
                }
            }
        }
        return ans;
    }
}
