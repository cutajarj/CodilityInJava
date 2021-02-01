package com.cutajarjames.codility.countingelements;

/**
 * This is the solution for CountingElements > FrogRiverOne
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        boolean[] riverPositions = new boolean[X + 1];
        for (int time = 0; time < A.length; time++) {
            int pos = A[time];
            if (!riverPositions[pos]) {
                riverPositions[pos] = true;
                X -= 1;
                if (X == 0) return time;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FrogRiverOne().solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        System.out.println(new FrogRiverOne().solution(1, new int[]{1, 1, 1}));
        System.out.println(new FrogRiverOne().solution(3, new int[]{1, 2, 1}));
    }
}
