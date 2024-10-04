package org.example.solutions;

/**
 * 60. Permutation Sequence
 * The set [1, 2, 3, ..., n] contains a total of n! unique permutations.
 * By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 *
 * Example 1:
 * Input: n = 3, k = 3
 * Output: "213"
 *
 * Example 2:
 * Input: n = 4, k = 9
 * Output: "2314"
 *
 * Example 3:
 * Input: n = 3, k = 1
 * Output: "123"
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int sum = 1;
        StringBuilder a = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sum = sum*i;
            a.append(i + "");
        }
        StringBuilder an = new StringBuilder();
        ans(an, a , k , sum);
        return an.toString();
    }
    public static StringBuilder ans(StringBuilder an,StringBuilder a , int k , int sum) {
        if (a.length() == 1) {
            return an.append(a.charAt(0));
        }
        if (k == 0) {
            return ans(an.append(a.charAt(a.length() - 1)),a.deleteCharAt(a.length() - 1) , 0 , sum);
        }
        sum = sum / a.length();
        int i;
        if (k >= sum) {
            if (k % sum > 0) {
                i = k / sum ;
            } else  {
                i = k / sum - 1 ;
            }
        } else {
            i = 0;
        }
        return ans(an.append(a.charAt(i)), a.deleteCharAt(i), k % sum, sum);
    }
}
