package org.example.solutions;

/**
 * 1232. Check If It Is a Straight Line
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 *
 * Example 1:
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 *
 * Example 2:
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 * Output: false
 */
public class CheckIfItIsAStraightLine {
    /**
     *    (x - x1) / (x2 - x1) != (y - y1) / (y2 - y1)
     *    (x - x1)*(y2 - y1) != (y - y1)*(x2 - x1)
     */
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        int x1, x2, y1, y2, x, y;
        x1 = coordinates[0][0];
        y1 = coordinates[0][1];
        x2 = coordinates[1][0];
        y2 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            x = coordinates[i][0];
            y = coordinates[i][1];
            try {
                if ((x - x1) * (y2 - y1) != (y - y1) * (x2 - x1)) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
