package org.example.solutions;

/**
 * 84. Largest Rectangle in Histogram
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return
 * the area of the largest rectangle in the histogram.
 *
 * Example 1:
 * Input: heights = [2,1,5,6,2,3]
 * Output: 10
 * Explanation: The above is a histogram where width of each bar is 1.
 * The largest rectangle is shown in the red area, which has an area = 10 units.
 *
 * Example 2:
 * Input: heights = [2,4]
 * Output: 4
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] L = new int[n];
        int[] R = new int[n];
        L[0] = -1;
        R[n - 1] = n;
        for (int i = 0; i < n; i++) {
            int Prev = i - 1;
            while (Prev >= 0 && heights[Prev] >= heights[i]) {
                Prev = L[Prev];
            }
            L[i] = Prev;
        }
        for (int j = n - 2; j >= 0; j--) {
            int Prev = j + 1;
            while (Prev < n && heights[Prev] >= heights[j]) {
                Prev = R[Prev];
            }
            R[j] = Prev;
        }
        int maxArea = 0;
        for (int k = 0; k < n; k++) {
            maxArea = Math.max(maxArea, (heights[k] * (R[k] - L[k] - 1)));
        }
        return maxArea;
    }
}
