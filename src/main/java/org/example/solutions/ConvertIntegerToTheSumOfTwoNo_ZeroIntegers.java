package org.example.solutions;

/**
 * 1317. Convert Integer to the Sum of Two No-Zero Integers
 * No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.
 * Given an integer n, return a list of two integers [a, b] where:
 * a and b are No-Zero integers.
 * a + b = n
 * The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you
 * can return any of them.
 *
 * Example 1:
 * Input: n = 2
 * Output: [1,1]
 * Explanation: Let a = 1 and b = 1.
 * Both a and b are no-zero integers, and a + b = 2 = n.
 *
 * Example 2:
 * Input: n = 11
 * Output: [2,9]
 * Explanation: Let a = 2 and b = 9.
 * Both a and b are no-zero integers, and a + b = 11 = n.
 * Note that there are other valid answers as [8, 3] that can be accepted.
 */
public class ConvertIntegerToTheSumOfTwoNo_ZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int [] res = new int[2];
        for (int i = 1; i <= n / 2; i++) {
            if (!Integer.toString(i).contains("0") && !Integer.toString(n - i).contains("0")) {
                res[0] = i;
                res[1] = n - i;
                break;
            }
        }
        return res;
    }
}
