package org.example.solutions;

/**
 * 7. Reverse Integer (Развернуть целое число)
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value
 * to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Example 3:
 * Input: x = 120
 * Output: 21
 */
public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder s = new StringBuilder();
        s.append(Math.abs(x));
        s.reverse();
        if (s.length() >= 10 ){
            int c1 = Integer.parseInt(s.substring(0 , 5) );
            int c2 = Integer.parseInt(s.substring(5 , 10) );
            if (c1 > 21474 || c2 > 83647){
                return 0;
            }
        }
        int num = Integer.parseInt(s.toString());
        return (x < 0) ? -num : num ;
    }
}
