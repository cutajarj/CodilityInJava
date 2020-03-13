package com.cutajarjames.codility.greedy;

/**
 * This is the solution for Greedy algorithms > MaxNonoverlappingSegments
 * The problem is equivalent to the Activity Selection Problem,
 * where you have to choose the maximum non overlapping tasks.
 * <p>
 * This is marked as PAINLESS difficulty
 */

public class MaxNonOverlappingSegments {
    public int solution(int[] A, int[] B) {
        int lastEndSegment = -1;
        int chosenCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > lastEndSegment) {
                chosenCount++;
                lastEndSegment = B[i];
            }
        }
        return chosenCount;
    }

    public static void main(String[] args) {
        System.out.println(new MaxNonOverlappingSegments().solution(new int[]{1, 3, 7, 9, 9}, new int[]{5, 6, 8, 9, 10}));
    }

}
