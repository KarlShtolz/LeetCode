package org.example.solutions;

/**
 * 434. Number of Segments in a String
 * Given a string s, return the number of segments in the string.
 * A segment is defined to be a contiguous sequence of non-space characters.
 *
 * Example 1:
 * Input: s = "Hello, my name is John"
 * Output: 5
 * Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
 *
 * Example 2:
 * Input: s = "Hello"
 * Output: 1
 */
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if (s.trim().length() == 0 || s == null)
            return 0;
        else {
            String[] strs = s.trim().split("\\s+");
            return strs.length;
        }
    }
}
