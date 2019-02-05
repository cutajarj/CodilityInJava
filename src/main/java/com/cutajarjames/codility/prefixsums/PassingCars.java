package com.cutajarjames.codility.prefixsums;

/**
 * This is the solution for Prefix Sums > Passing Cars
 * <p>
 * This is marked as PAINLESS difficulty
 */

public class PassingCars {

    public int solution(int[] A) {
        int[] suffixSum = new int[A.length + 1];
        int count = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            suffixSum[i] = A[i] + suffixSum[i + 1];
            if (A[i] == 0) count += suffixSum[i];
            if (count > 1000000000) return -1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new PassingCars().solution(new int[]{0, 1, 0, 1, 1}));
    }
}

