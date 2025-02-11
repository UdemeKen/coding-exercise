package org.udemekendrick.leetcode;

public class MedianTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

//        Merge the two sorted array
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            }else {
                merged[k++] = nums2[j++];
            }
        }

//        Append the remaining elements from nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

//        Append the remaining elements from nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int totalLength = m + n;
        if (totalLength % 2 == 0) {
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        }else {
            return merged[totalLength / 2];
        }

    }
}
