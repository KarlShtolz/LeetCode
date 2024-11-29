package org.example.solutions;

/**
 * 1861. Rotating the Box
 * You are given an m x n matrix of characters boxGrid representing a side-view of a box. Each cell of the box is one
 * of the following:
 *     A stone '#'
 *     A stationary obstacle '*'
 *     Empty '.'
 * The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down
 * until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles'
 * positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.
 * It is guaranteed that each stone in boxGrid rests on an obstacle, another stone, or the bottom of the box.
 * Return an n x m matrix representing the box after the rotation described above.
 *
 * Example 1:
 * Input: boxGrid = [["#",".","#"]]
 * Output: [["."],
 *          ["#"],
 *          ["#"]]
 *
 * Example 2:
 * Input: boxGrid = [["#",".","*","."],
 *               ["#","#","*","."]]
 * Output: [["#","."],
 *          ["#","#"],
 *          ["*","*"],
 *          [".","."]]
 *
 * Example 3:
 * Input: boxGrid = [["#","#","*",".","*","."],
 *               ["#","#","#","*",".","."],
 *               ["#","#","#",".","#","."]]
 * Output: [[".","#","#"],
 *          [".","#","#"],
 *          ["#","#","*"],
 *          ["#","*","."],
 *          ["#",".","*"],
 *          ["#",".","."]]
 */
public class RotatingTheBox {
    public char[][] rotateTheBox(char[][] box) {
        char stone = '#';
        char wall = '*';
        char empty = '.';
        int heightBox = box.length;
        int widthBox = box[0].length;
        //printMatrix(box);
        char [][] arr = new char[widthBox][heightBox];
        for (int i = 0; i < heightBox; i++) {
            for (int j = 0; j < widthBox; j++) {
                arr[j][i] = box[heightBox - i - 1][j];
            }
        }
        int tmpI = 0;
        int tmpJ = 0;
        for (int i = 1; i < widthBox; i++) {
            for (int j = 0; j < heightBox; j++) {
                tmpI = widthBox - 1 - i;
                tmpJ = j;
                while (tmpI + 1 < widthBox && arr[tmpI][tmpJ] == stone && arr[tmpI + 1][tmpJ] == empty) {
                    arr[tmpI][tmpJ] = empty;
                    arr[tmpI + 1][tmpJ] = stone;
                    tmpI++;
                }
            }
        }
        //printMatrix(arr);
        return arr;
    }
    // public void printMatrix (char[][] box) {
    //     int h = box.length;
    //     int w = box[0].length;
    //     for (int i = 0; i < h; i++) {
    //         for (int j = 0; j < w; j++) {
    //             System.out.print(box[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("____________END________________");
    // }
}
