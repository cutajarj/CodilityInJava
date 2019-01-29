package com.cutajarjames.codility.sorting;

/**
 * This is the solution for Sorting > NumberOfDiscIntersections
 * <p>
 * This is marked as RESPECTABLE difficulty
 */

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solution(int A[]) {
        int len = A.length;
        DiscLog[] discHistory = new DiscLog[len * 2];
        int j = 0;
        for (int i = 0; i < len; i++) {
            discHistory[j++] = new DiscLog(i - (long) A[i], 1);
            discHistory[j++] = new DiscLog(i + (long) A[i], -1);
        }
        Arrays.sort(discHistory);
        int intersections = 0;
        int activeIntersections = 0;
        for (DiscLog log : discHistory) {
            activeIntersections += log.startEnd;
            if (log.startEnd > 0) intersections += activeIntersections - 1;
            if (intersections > 10000000) return -1;
        }
        return intersections;
    }

    class DiscLog implements Comparable<DiscLog> {
        final long x;
        final int startEnd;

        DiscLog(long x, int startEnd) {
            this.x = x;
            this.startEnd = startEnd;
        }

        @Override
        public int compareTo(DiscLog b) {
            return this.x != b.x ? Long.compare(this.x, b.x) : Integer.compare(b.startEnd, this.startEnd);
        }
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfDiscIntersections().solution(new int[]{1, 5, 2, 1, 4, 0}));
    }
}
