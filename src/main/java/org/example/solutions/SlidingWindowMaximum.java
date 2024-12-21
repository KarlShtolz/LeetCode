package org.example.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 239. Sliding Window Maximum
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of
 * the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right
 * by one position.
 * Return the max sliding window.
 *
 * Example 1:
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deq = new ArrayDeque<>();
        int sz = nums.length, result[] = new int[sz - k + 1], idx = 0;
        for(int indx = 0; indx < sz; indx++){
            int currNum = nums[indx];
            while(!deq.isEmpty() && deq.peekLast() < indx - k + 1){
                deq.pollLast();
            }
            while(!deq.isEmpty() && nums[deq.peekFirst()] < currNum){
                deq.pollFirst();
            }
            deq.offerFirst(indx);
            if(indx + 1 >= k){
                result[idx++] = nums[deq.peekLast()];
            }
        }
        return result;
    }
}
