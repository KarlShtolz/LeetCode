package org.example.solutions;

/**
 * 335. Self Crossing
 * You are given an array of integers distance.
 * You start at the point (0, 0) on an X-Y plane, and you move distance[0] meters to the north, then distance[1] meters
 * to the west, distance[2] meters to the south, distance[3] meters to the east, and so on. In other words, after each
 * move, your direction changes counter-clockwise. Return true if your path crosses itself or false if it does not.
 *
 * Example 1:
 * Input: distance = [2,1,1,2]
 * Output: true
 * Explanation: The path crosses itself at the point (0, 1).
 *
 * Example 2:
 * Input: distance = [1,2,3,4]
 * Output: false
 * Explanation: The path does not cross itself at any point.
 *
 * Example 3:
 * Input: distance = [1,1,1,2,1]
 * Output: true
 * Explanation: The path crosses itself at the point (0, 0).
 */
public class SelfCrossing {
    public boolean isSelfCrossing(int[] d) {
        for (int i = 3; i < d.length; i++) {
            if (d[i] >= d[i - 2] && d[i - 1] <= d[i - 3]) {
                return true;
            }
            if (i >= 4) {
                if (d[i] + d[i - 4] == d[i - 2] && d[i - 1] == d[i - 3]) {
                    return true;
                }
            }
            if (i >= 5) {
                if (d[i] + d[i - 4] >= d[i - 2] && d[i - 1] + d[i - 5] >= d[i - 3] && d[i - 2] > d[i - 4] && d[i - 3] > d[i - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
