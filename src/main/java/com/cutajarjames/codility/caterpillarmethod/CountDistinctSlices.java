package com.cutajarjames.codility.caterpillarmethod;

import java.util.Arrays;

/**
 * This is the solution for Caterpillar method > CountDistinctSlices
 *
 * This is marked as PAINLESS difficulty
 */

public class CountDistinctSlices {
    public int solution(int M, int[] A) {
        int totalSlices = 0;
        boolean[] inCurrentSlice = new boolean[M + 1];
        Arrays.fill(inCurrentSlice, false);
        int head = 0;
        for (int tail = 0; tail < A.length; tail++) {
            while (head < A.length && !inCurrentSlice[A[head]]) {
                inCurrentSlice[A[head]] = true;
                totalSlices += (head - tail) + 1;
                head += 1;
                if (totalSlices > 1000000000)
                    totalSlices = 1000000000;
            }
            inCurrentSlice[A[tail]] = false;
        }
        return totalSlices;
    }

    public static void main(String[] args) {
        System.out.println(new CountDistinctSlices().solution(9, new int[]{2, 4, 1, 7, 4, 9, 7, 3, 5, 5, 8, 7, 1}));
        System.out.println(new CountDistinctSlices().solution(6, new int[]{3, 4, 5, 5, 2}));
    }
}
