package org.example.solutions;

/**
 * 962. Maximum Width Ramp
 * A ramp in an integer array nums is a pair (i, j) for which i < j and nums[i] <= nums[j]. The width of such
 * a ramp is j - i. Given an integer array nums, return the maximum width of a ramp in nums. If there is no ramp in
 * nums, return 0.
 *
 * Example 1:
 * Input: nums = [6,0,8,2,1,5]
 * Output: 4
 * Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.
 *
 * Example 2:
 * Input: nums = [9,8,1,0,1,9,4,0,4,1]
 * Output: 7
 * Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.
 */
public class MaximumWidthRamp {
    public int maxWidthRamp(int[] nums) {
        int low = 1, high = nums.length-1, res = 0;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(possible(nums, mid)) {
                res = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return res;
    }
    private boolean possible(int[] nums, int width) {
        int i=0,j=width;
        int min = nums[i];
        while(j < nums.length) {
            if(nums[j] >= min) return true;
            j++;
            min = Math.min(min, nums[++i]);
        }
        return false;
    }
}
