package com.cutajarjames.codility.countingelements;

import java.util.Arrays;

/**
 * This is the solution for CountingElements > MaxCounters
 * <p>
 * This is marked as RESPECTABLE difficulty
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);
        int start_line = 0;
        int current_max = 0;
        for (int i : A) {
            int x = i - 1;
            if (i > N) start_line = current_max;
            else if (counters[x] < start_line) counters[x] = start_line + 1;
            else counters[x] += 1;
            if (i <= N && counters[x] > current_max) current_max = counters[x];
        }
        for (int i = 0; i < counters.length; i++)
            if (counters[i] < start_line) counters[i] = start_line;
        return counters;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }
}
