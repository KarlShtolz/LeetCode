package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Median of Two Sorted Arrays (Медиана двух отсортированных массивов)
 * Учитывая два отсортированных массива nums1и nums2размер mи nсоответственно, верните медиану двух отсортированных
 * массивов. Общая сложность времени выполнения должна составлять O(log (m+n)).
 *
 * Пример 1:
 * Ввод: nums1 = [1,3], nums2 = [2]
 *  Выход: 2,00000
 *  Объяснение: объединенный массив = [1,2,3] и медиана равна 2.
 *
 * Пример 2:
 * Ввод: nums1 = [1,2], nums2 = [3,4]
 *  Выход: 2,50000
 *  Объяснение: объединенный массив = [1,2,3,4] и медиана равна (2 + 3)/2 = 2,5.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged.add(nums1[i++]);
            } else {
                merged.add(nums2[j++]);
            }
        }

        while (i < nums1.length) merged.add(nums1[i++]);
        while (j < nums2.length) merged.add(nums2[j++]);

        int mid = merged.size() / 2;
        if (merged.size() % 2 == 0) {
            return (merged.get(mid-1) + merged.get(mid)) / 2.0;
        } else {
            return merged.get(mid);
        }
    }
}
