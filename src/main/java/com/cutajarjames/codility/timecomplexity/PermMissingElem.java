package com.cutajarjames.codility.timecomplexity;

/**
 * This is the solution for Time Complexity > PermMissingElem
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class PermMissingElem {
    public int solution(int[] A) {
        long actualSum = 0;
        for (int number: A) {
            actualSum += number;
        }
        long maxNumber = A.length + 1;
        long expectedSum = (maxNumber * (maxNumber + 1) / 2);
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2, 3, 1, 5}));
        System.out.println(new PermMissingElem().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(new PermMissingElem().solution(new int[]{}));
    }
}
