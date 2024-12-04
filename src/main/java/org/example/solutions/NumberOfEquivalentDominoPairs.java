package org.example.solutions;

/**
 * 1128. Number of Equivalent Domino Pairs
 * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either
 * (a == c and b == d), or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.
 * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
 *
 * Example 1:
 * Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
 * Output: 1
 *
 * Example 2:
 * Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
 * Output: 3
 */
public class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] pairs = new int[10][10];

        for(int[] domino : dominoes) {
            pairs[domino[0]][domino[1]]++;
        }

        int pairCount = 0;
        int total = 0;

        for(int row = 1; row < pairs.length; row++) {
            for(int col = row; col < pairs.length; col++) {
                if(row == col) {
                    pairCount = pairs[row][col];
                } else {
                    pairCount = pairs[row][col] + pairs[col][row];
                }
                total += pairCount * (pairCount - 1) / 2;
            }
        }
        return total;
    }
}
