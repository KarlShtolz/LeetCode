package org.example.solutions;

/**
 * 1137. N-th Tribonacci Number
 * The Tribonacci sequence Tn is defined as follows:
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * Given n, return the value of Tn.
 *
 * Example 1:
 * Input: n = 4
 * Output: 4
 * Explanation:
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *
 * Example 2:
 * Input: n = 25
 * Output: 1389537
 */
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int tr0 = 0;
        int tr1 = 1;
        int tr2 = 1;
        if (n == 0) {
            return tr0;
        }
        if (n == 1 || n == 2) {
            return tr1;
        }
        int tr = 0;
        for (int i = 0; i < n; i++) {
            tr = tr0 + tr1 + tr2;
            tr0 = tr1;
            tr1 = tr2;
            tr2 = tr;
        }
        return tr0;
    }
}
