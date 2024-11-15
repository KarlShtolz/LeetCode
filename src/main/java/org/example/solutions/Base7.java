package org.example.solutions;

/**
 * 504. Base 7
 * Given an integer num, return a string of its base 7 representation.
 *
 * Example 1:
 * Input: num = 100
 * Output: "202"
 *
 * Example 2:
 * Input: num = -7
 * Output: "-10"
 */
public class Base7 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}
