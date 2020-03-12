package com.cutajarjames.codility.greedy;

public class TieRopes {
    public int solution(int K, int[] A) {
        int count = 0;
        int ropeLength = 0;
        for (int rope : A) {
            ropeLength += rope;
            if (ropeLength >= K) {
                count++;
                ropeLength = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new TieRopes().solution(4, new int[]{1, 2, 3, 4, 1, 1, 3}));
    }
}
