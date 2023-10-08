package org.example.solutions;

import java.util.Arrays;

/**
 * 42. Trapping Rain Water
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water
 * it can trap after raining.
 *
 * Example 1:
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case,
 * 6 units of rain water (blue section) are being trapped.
 *
 * Example 2:
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int[] rightMax = new int[n];

        int max = height[n - 1];
        for(int i = n - 1; i >=0; i--) {
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }
        System.out.println(Arrays.toString(rightMax));
        int ans = 0;
        int leftMax = height[0];
        for(int i = 0; i < n; i++) {
            leftMax = Math.max(leftMax, height[i]);
            System.out.println("leftMax="+leftMax+" height[i]="+height[i]+" Math.min(leftMax, rightMax[i]) - height[i]="+ans);
            ans += Math.min(leftMax, rightMax[i]) - height[i];
        }
        return ans;
    }
}
