package org.example.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * 989. Add to Array-Form of Integer
 * The array-form of an integer num is an array representing its digits in left to right order.
 * For example, for num = 1321, the array form is [1,3,2,1].
 * Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
 *
 * Example 1:
 * Input: num = [1,2,0,0], k = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 *
 * Example 2:
 * Input: num = [2,7,4], k = 181
 * Output: [4,5,5]
 * Explanation: 274 + 181 = 455
 *
 * Example 3:
 * Input: num = [2,1,5], k = 806
 * Output: [1,0,2,1]
 * Explanation: 215 + 806 = 1021
 */
public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        int carry = 0;
        int i = 0;
        for (i = num.length - 1; i >= 0 && k > 0; i--) {
            int temp = num[i];
            res.addFirst((temp + carry + (k % 10)) % 10);
            carry = (temp + carry + (k % 10)) / 10;
            k /= 10;
        }
        while (k != 0) {
            int compute = (k % 10) + carry;
            res.addFirst(compute % 10);
            carry = compute / 10;
            k /= 10;
        }
        for (int r = i; r >= 0; r--) {
            int temp = num[r];
            res.addFirst((temp + carry) % 10);
            carry = (temp + carry) / 10;
        }
        if (carry != 0) res.addFirst(carry);
        return res;
    }
}
