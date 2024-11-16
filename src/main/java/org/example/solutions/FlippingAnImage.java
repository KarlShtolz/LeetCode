package org.example.solutions;

/**
 * 832. Flipping an Image
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0,1,1] results in [1,0,0].
 *
 * Example 1:
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * Example 2:
 * Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int w = image[0].length;
        int h = image.length;
        int [][] tmp = new int[h][w];
        int t = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                t = image[i][w - 1 - j];
                if (t == 0) {
                    tmp[i][j] = 1;
                } else {
                    tmp[i][j] = 0;
                }
            }
        }
        return tmp;
    }
}
