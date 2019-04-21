package com.cutajarjames.codility.primeandcompositenumbers;

/**
 * This is the alternate solution for Primes And Composite > Flags
 * <p>
 * This is marked as Respectable difficulty
 */

public class FlagsFaster {
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

        int upper_guess = (int)Math.sqrt(A.length) + 2;
        int lower_guess = 0;
        while (lower_guess < upper_guess - 1) {
            int current_guess = (lower_guess + upper_guess) / 2;
            if (canPlaceFlags(peaks, current_guess))
                lower_guess = current_guess;
            else
                upper_guess = current_guess;
        }

        return lower_guess;
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
        System.out.println(new FlagsFaster().solution(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }
}
