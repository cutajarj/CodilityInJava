package com.cutajarjames.codility.timecomplexity;

/**
 * This is the solution for Time Complexity > PermMissingElem
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class PermMissingElem {
    public int solution(int[] A) {
        long maxNumber = A.length + 1;
        long sum = 0;
        for (int number : A) {
            sum += number;
        }
        return (int) ((maxNumber * (maxNumber + 1) / 2) - sum);
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2, 3, 1, 5}));
    }
}
