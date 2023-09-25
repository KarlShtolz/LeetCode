package org.example.solutions;

/**
 * 6. Zigzag Conversion
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to
 * display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 *
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * Example 3:
 * Input: s = "A", numRows = 1
 * Output: "A"
 */
public class ZigzagConversion {
    public String convert(String s, int rowNum) {
        if (rowNum == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rowNum; i++) {
            int lastPos = -1;
            for (int j = 0; true; j++) {
                int pos = -1;
                if (i == 0) {
                    pos = j * 2 * (rowNum - 1);
                } else if (i == rowNum - 1) {
                    pos = (rowNum - 1) + j * 2 * (rowNum - 1);
                } else {
                    if (j == 0) {
                        pos = i;
                        lastPos = pos;
                    } else if (j % 2 == 1) {
                        pos = lastPos + 2 * (rowNum - 1 - i);
                        lastPos = pos;
                    } else {
                        pos = lastPos + 2 * i;
                        lastPos = pos;
                    }
                }
                if (
                        pos >= s.length()
                ) {
                    break;
                }
                sb.append(s.charAt(pos));
            }
        }
        return sb.toString();
    }
}
