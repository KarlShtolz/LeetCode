package org.example.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 1207. Unique Number of Occurrences
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or
 * false otherwise.
 *
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 *
 * Example 2:
 * Input: arr = [1,2]
 * Output: false
 *
 * Example 3:
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int index = 0;
        int tmp = 0;
        int size = 0;
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> counters = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!values.contains(j)) {
                values.add(j);
                counters.add(1);
            } else {
                index = values.indexOf(j);
                tmp = counters.get(index);
                counters.set(index, tmp + 1);
            }
        }
        for (Integer counter : counters) {
            size = set.size();
            set.add(counter);
            if (set.size() == size) {
                return false;
            }
        }
        return true;
    }
}
