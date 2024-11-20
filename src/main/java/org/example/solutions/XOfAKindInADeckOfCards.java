package org.example.solutions;

/**
 * 914. X of a Kind in a Deck of Cards
 * You are given an integer array deck where deck[i] represents the number written on the ith card.
 * Partition the cards into one or more groups such that:
 * Each group has exactly x cards where x > 1, and
 * All the cards in one group have the same integer written on them.
 * Return true if such partition is possible, or false otherwise.
 *
 * Example 1:
 * Input: deck = [1,2,3,4,4,3,2,1]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
 *
 * Example 2:
 * Input: deck = [1,1,1,2,2,2,3,3]
 * Output: false
 * Explanation: No possible partition.
 */
public class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int [] deck) {
        if (deck.length < 2) return false;
        int val = 0;
        int [] arr = new int[100];
        for (int i : deck) {
            arr[i]++;
        }
        for (int i = 0; i < 100; i++) {
            if (arr[i] != 0) {
                val = gcd(val, arr[i]);
            }
        }
        return val > 1;
    }

    private int gcd (int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        if (num2 > num1) {
            return gcd(num2, num1);
        }
        return gcd(num2, num1 % num2);
    }
}
