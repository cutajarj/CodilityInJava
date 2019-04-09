package com.cutajarjames.codility.primeandcompositenumbers;

public class Flags {
    public int solution(int[] A) {
        boolean[] peaks = new boolean[A.length];
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i])
                peaks[i] = true;
        }

        int upper_guess = (int) Math.ceil(Math.sqrt(A.length)) + 1;
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

    private boolean canPlaceFlags(boolean[] peaks, int flagsToPlace) {
        int currentPosition = 0;
        int totalFlags = flagsToPlace;
        while (currentPosition < peaks.length - 1 && totalFlags > 0) {
            if (peaks[currentPosition]) {
                totalFlags -= 1;
                currentPosition += flagsToPlace;
            } else {
                currentPosition += 1;
            }
        }
        return totalFlags == 0;
    }

    public static void main(String[] args) {
        int[] test_trail = new int[100000];
        for (int i = 0; i < test_trail.length; i++)
            if (i % 2 == 1) test_trail[i] += 1;
        System.out.println(new Flags().solution(test_trail));
    }

}
