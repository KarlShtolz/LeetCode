package org.example.solutions;

/**
 * 461. Hamming Distance
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, return the Hamming distance between them.
 *
 * Example 1:
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * The above arrows point to positions where the corresponding bits are different.
 *
 * Example 2:
 * Input: x = 3, y = 1
 * Output: 1
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        String xS = Integer.toBinaryString(x);
        String yS = Integer.toBinaryString(y);
        int counter = 0;
        if (xS.length() < yS.length()) {
            xS = "0".repeat(yS.length() - xS.length()) + xS;
        }
        if (xS.length() > yS.length()) {
            yS = "0".repeat(xS.length() - yS.length()) + yS;
        }
        for (int i = 0; i < xS.length(); i++) {
            if (xS.charAt(i) != yS.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
