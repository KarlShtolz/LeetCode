package org.example.solutions;

import java.util.*;

/**
 * 57. Insert Interval
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start
 * and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval
 * newInterval = [start, end] that represents the start and end of another interval.
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals
 * still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * Return intervals after the insertion.
 * Note that you don't need to modify intervals in-place. You can make a new array and return it.
 *
 * Example 1:
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 *
 * Example 2:
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int [][] intervals2 = new int [intervals.length + 1][2];
        for (int i = 0; i < intervals.length; i++) {
            intervals2[i] = intervals[i];
        }
        intervals2[intervals.length] = newInterval;
        Arrays.sort(intervals2, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals2[0]);
        for (int i = 1; i < intervals2.length; i++) {
            if (intervals2[i][0] <= ans.get(ans.size()-1)[1]) {
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], intervals2[i][1]);
            } else {
                ans.add(intervals2[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
