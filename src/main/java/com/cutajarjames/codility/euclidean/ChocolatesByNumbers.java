package com.cutajarjames.codility.euclidean;

/**
 * This is the solution for Euclidean Algorithms > ChocolatesByNumbers
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class ChocolatesByNumbers {
    private int findGcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return findGcd(b, a % b);
    }

    public int solution(int N, int M) {
        return N / findGcd(N, M);
    }

    public static void main(String[] args) {
        System.out.println(new ChocolatesByNumbers().solution(10,4));
        System.out.println(new ChocolatesByNumbers().solution(9,6));
        System.out.println(new ChocolatesByNumbers().solution(10,11));
    }
}
