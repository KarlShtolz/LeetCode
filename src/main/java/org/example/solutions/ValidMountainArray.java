package org.example.solutions;

/**
 * 941. Valid Mountain Array
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Recall that arr is a mountain array if and only if:
 *     arr.length >= 3
 *     There exists some i with 0 < i < arr.length - 1 such that:
 *         arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 *         arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Example 1:
 * Input: arr = [2,1]
 * Output: false
 *
 * Example 2:
 * Input: arr = [3,5,5]
 * Output: false
 *
 * Example 3:
 * Input: arr = [0,3,2,1]
 * Output: true
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int flagDecrease = -3;
        int flagEncrease = -3;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
            if (arr[i] < arr[i + 1]) {
                flagEncrease = 1;
                if (flagDecrease == -1) {
                    return false;
                }
            }
            if (arr[i] > arr[i + 1]) {
                flagDecrease = -1;
            }
        }
        return flagDecrease != -3 && flagEncrease != -3;
    }
}
