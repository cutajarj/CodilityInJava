package com.cutajarjames.codility.prefixsums;

/**
 * This is the solution for Prefix Sums > Count Div
 * <p>
 * This is marked as PAINLESS difficulty
 */


public class CountDiv {
    public int solution(int A, int B, int K) {
        double nStart = Math.ceil((double) A / (double) K);
        double nEnd = Math.floor((double) B / (double) K);
        return (int) (nEnd - nStart + 1);
    }

    public static void main(String[] args) {
        System.out.println(new CountDiv().solution(6, 11, 2));
    }

}
