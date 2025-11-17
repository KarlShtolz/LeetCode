package org.example.solutions;

/**
 * 1437. Check If All 1's Are at Least Length K Places Away
 * Given an binary array nums and an integer k, return true if all 1's are at least k places away from each other,
 * otherwise return false.
 *
 * Example 1:
 * Input: nums = [1,0,0,0,1,0,0,1], k = 2
 * Output: true
 * Explanation: Each of the 1s are at least 2 places away from each other.
 *
 * Example 2:
 * Input: nums = [1,0,0,1,0,1], k = 2
 * Output: false
 * Explanation: The second 1 and third 1 are only one apart from each other.
 */
public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        int prevOne = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (prevOne == -1) {
                    prevOne = i;
                } else {
                    System.out.println(i - prevOne);
                    if (i - prevOne < k + 1) {
                        return false;
                    }
                    prevOne = i;
                }
            }
        }
        return true;
    }
}
