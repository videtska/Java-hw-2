package com.nina.hw2;

public class PosNegFirst {
    public static void firstPosNeg(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.println("Negative first!");
                break;
            } else {
                if (a[i] > 0) {
                    System.out.println("Positive first!");
                    break;
                }
            }
        }
    }
}
