package com.cutajarjames.codility.primeandcompositenumbers;

/**
 * This is the solution for Primes And Composite > Flags
 * <p>
 * This is marked as Respectable difficulty
 */

public class Flags {
    public int solution(int[] A) {
        int nextPeak = A.length;
        int[] peaks = new int[A.length];
        peaks[A.length - 1] = nextPeak;
        for (int i = A.length - 2; i > 0; i--) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i])
                nextPeak = i;
            peaks[i] = nextPeak;
        }
        peaks[0] = nextPeak;

        int current_guess = 0;
        int next_guess = 0;
        while (canPlaceFlags(peaks, next_guess)) {
            current_guess = next_guess;
            next_guess += 1;
        }

        return current_guess;
    }

    private boolean canPlaceFlags(int[] peaks, int flagsToPlace) {
        int currentPosition = 1 - flagsToPlace;
        for (int i = 0; i < flagsToPlace; i++) {
            if (currentPosition + flagsToPlace > peaks.length - 1)
                return false;
            currentPosition = peaks[currentPosition + flagsToPlace];
        }
        return currentPosition < peaks.length;
    }

    public static void main(String[] args) {
        System.out.println(new Flags().solution(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }
}
