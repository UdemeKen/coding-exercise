package org.udemekendrick;

import org.udemekendrick.hackerrank.JavaStringIntroduction;
import org.udemekendrick.leetcode.MedianTwoSortedArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {6, 7, 8, 9, 10, 11};
        System.out.println(MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}