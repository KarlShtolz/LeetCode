package org.example.solutions;

/**
 * 204. Count Primes
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 *
 * Example 1:
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 *
 * Example 2:
 * Input: n = 0
 * Output: 0
 *
 * Example 3:
 * Input: n = 1
 * Output: 0
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        boolean[] isNotPrime = new boolean[n];
        int sqrtN = (int) Math.sqrt(n);
        int numberOfPrimes = n / 2;
        for (int p = 3; p <= sqrtN; p += 2) {
            if (isNotPrime[p])
                continue;
            int d = 2 * p;
            for (int j = p * p; j < n; j += d) {
                if (isNotPrime[j])
                    continue;
                isNotPrime[j] = true;
                --numberOfPrimes;
            }
        }
        return numberOfPrimes;
    }
}
