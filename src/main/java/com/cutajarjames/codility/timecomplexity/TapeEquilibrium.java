package com.cutajarjames.codility.timecomplexity;

/**
 * This is the solution for Time Complexity > TapeEquilibrium
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        int leftSum = A[0];
        int rightSum = 0;
        for (int x : A)
            rightSum += x;
        rightSum -= leftSum;

        int diff = Math.abs(leftSum - rightSum);
        for (int i = 1; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            int currentDiff = Math.abs(leftSum - rightSum);
            if (diff > currentDiff) diff = currentDiff;
        }
        return diff;
    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{3, 1, 2, 4, 3}));
    }
}