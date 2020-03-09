package com.nina.hw2;

public class IsSortedAsc {
    public static void isSortedAsc(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                continue;
            } else {
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Sorted!");
    }
}
