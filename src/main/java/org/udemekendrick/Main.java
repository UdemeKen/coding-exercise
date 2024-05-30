package org.udemekendrick;

import org.udemekendrick.geeksforgeeks.CardShuffle;
import org.udemekendrick.hackerrank.JavaStringIntroduction;
import org.udemekendrick.leetcode.MedianTwoSortedArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] rounds = {2, 3};
        int N = 7;

        int result = CardShuffle.getNthCard(rounds, N);
        System.out.println(result);
    }
}