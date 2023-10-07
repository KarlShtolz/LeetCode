package org.example.solutions;

/**
 * 41. First Missing Positive
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 *
 * Example 1:
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 *
 * Example 2:
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 *
 * Example 3:
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 */

public class FirstMissingPositive {
    // public int firstMissingPositive(int[] nums) {
    //     int numsLength = nums.length;
    //     Arrays.sort(nums);
    //     int ONE_INDEX = -1;
    //     int ans = -1;
    //     for (int i = 0; i < numsLength; i++) {
    //         if (nums[i] == 1) {
    //             ONE_INDEX = i;
    //             break;
    //         }
    //     }
    //     if (ONE_INDEX == -1) {
    //         return 1;
    //     }
    //     if (numsLength == 2) {
    //         if (nums[1] != 2) {
    //             return 2;
    //         }
    //     }
    //     for (int i = ONE_INDEX; i < numsLength - 1; i++) {
    //         System.out.print(nums[i + 1] - nums[i]);
    //         if (nums[i + 1] - nums[i] > 1 || nums[i + 1] - nums[i] < -1) {
    //             ans = (nums[i] + 1);
    //             return ans;
    //         }
    //     }
    //     if (ans == -1) {
    //         System.out.print(-1);
    //         return (nums[numsLength - 1] + 1);
    //     } else {
    //         return -1;
    //     }
    // }
    public int firstMissingPositive(int[] nums) {
        int i = -1;
        int pointer, swp;
        while (i < nums.length - 1) {
            i++;
            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = 0;
                continue;
            }

            if (nums[i] - 1 == i) {
                continue;
            }

            pointer = nums[i] - 1;
            if (nums[pointer] <= 0 || nums[pointer] > nums.length) {
                nums[pointer] = nums[i];
                nums[i] = 0;
                continue;
            }

            swp = nums[pointer];
            if (nums[pointer] > 0 && nums[pointer] <= i + 1) {
                nums[pointer] = nums[i];
                nums[i] = 0;
                nums[swp - 1] = swp;
            } else {
                if (nums[i] == nums[pointer]) {
                    nums[i] = 0;
                } else {
                    nums[pointer] = nums[i];
                    nums[i] = swp;
                    i--;
                }
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
