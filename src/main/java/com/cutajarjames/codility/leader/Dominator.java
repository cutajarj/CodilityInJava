package com.cutajarjames.codility.leader;

/**
 * This is the solution for Leader > Dominator
 *
 * This is marked as PAINLESS difficulty
 */

public class Dominator {
    public int solution(int[] A) {
        int consecutiveSize = 0;
        int candidate = 0;
        for (int item : A) {
            if (consecutiveSize == 0) {
                candidate = item;
                consecutiveSize += 1;
            } else if (candidate == item) {
                consecutiveSize += 1;
            } else {
                consecutiveSize -= 1;
            }
        }

        int occurrence = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                occurrence++;
                index = i;
            }
        }
        return occurrence > A.length / 2.0 ? index : -1;
    }

    public static void main(String[] args) {
        System.out.println(new Dominator().solution(new int[]{3, 0, 1, 1, 4, 1, 1}));
        System.out.println(new Dominator().solution(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

}
