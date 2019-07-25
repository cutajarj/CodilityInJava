package com.cutajarjames.codility.countingelements;

import java.util.Arrays;

/**
 * This is the solution for CountingElements > MissingInteger
 * <p>
 * This is marked as RESPECTABLE difficulty
 */
public class MissingInteger {
    public int solution(int[] A) {
        boolean[] presentMarkers = new boolean[A.length + 2];
        Arrays.fill(presentMarkers, false);
        for (int i : A) {
            if (i > 0 && i <= A.length) presentMarkers[i] = true;
        }
        int missingCandidate = 1;
        while (presentMarkers[missingCandidate]) {
            missingCandidate ++;
        }
        return missingCandidate;
    }

    public static void main(String[] args) {
        System.out.println(new MissingInteger().solution(new int[]{1,3,6,4,1,2}));
        System.out.println(new MissingInteger().solution(new int[]{1,1,1,9,9,9}));
        System.out.println(new MissingInteger().solution(new int[]{1, 2, 3}));
        System.out.println(new MissingInteger().solution(new int[]{-1, -3}));
        System.out.println(new MissingInteger().solution(new int[]{-1, -3, 1}));
        System.out.println(new MissingInteger().solution(new int[]{-1, -3, 3}));
    }
}
