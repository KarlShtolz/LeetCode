package org.example.solutions;

/**
 * 593. Valid Square
 * Given the coordinates of four points in 2D space p1, p2, p3 and p4, return true if the four points construct a
 * square. The coordinate of a point pi is represented as [xi, yi]. The input is not given in any order.
 * A valid square has four equal sides with positive length and four equal angles (90-degree angles).
 *
 * Example 1:
 * Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
 * Output: true
 *
 * Example 2:
 * Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,12]
 * Output: false
 *
 * Example 3:
 * Input: p1 = [1,0], p2 = [-1,0], p3 = [0,1], p4 = [0,-1]
 * Output: true
 */
public class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if (p1[0] == p2[0] && p1[1] == p2[1] ||
                p1[0] == p3[0] && p1[1] == p3[1] ||
                p1[0] == p4[0] && p1[1] == p4[1] ||
                p2[0] == p3[0] && p2[1] == p3[1] ||
                p2[0] == p4[0] && p2[1] == p4[1] ||
                p3[0] == p4[0] && p3[1] == p4[1]) {
            return false;
        }
        double dis12 = distanceBetweenPoints(p1, p2);
        double dis13 = distanceBetweenPoints(p1, p3);
        double dis14 = distanceBetweenPoints(p1, p4);
        double dis23 = distanceBetweenPoints(p2, p3);
        double dis24 = distanceBetweenPoints(p2, p4);
        double dis34 = distanceBetweenPoints(p3, p4);
        return dis12 == dis13 && dis34 == dis24 && dis14 == dis12 + dis13 && dis23 == dis12 + dis24 ||
                dis12 == dis14 && dis34 == dis23 && dis24 == dis12 + dis23 && dis13 == dis12 + dis14 ||
                dis14 == dis13 && dis24 == dis23 && dis34 == dis23 + dis24 && dis12 == dis14 + dis13 ||
                dis34 == dis13 && dis12 == dis24 && dis14 == dis12 + dis24 && dis23 == dis34 + dis13 ||
                dis14 == dis34 && dis12 == dis23 && dis13 == dis23 + dis34 && dis24 == dis14 + dis34;
    }
    public double distanceBetweenPoints (int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }
}
