package org.example.solutions;

/**
 * 1089. Duplicate Zeros
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the
 * right. Note that elements beyond the length of the original array are not written. Do the above modifications to the
 * input array in place and do not return anything.
 *
 * Example 1:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 * Example 2:
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int [] ans = new int[arr.length];
        int l = arr.length;
        int ptrArr = 0;
        int ptrAns = 0;
        for (ptrAns = 0; ptrAns < l && ptrArr < l; ptrAns++) {
            if (arr[ptrArr] != 0) {
                ans[ptrAns] = arr[ptrArr];
            } else if (arr[ptrArr] == 0) {
                ans[ptrAns] = 0;
                if (ptrAns + 1 < l) {
                    ans[ptrAns + 1] = 0;
                }
                ptrAns++;
            }
            ptrArr++;
        }
        for (ptrAns = 0; ptrAns < l; ptrAns++) {
            arr[ptrAns] = ans[ptrAns];
        }
    }
}
