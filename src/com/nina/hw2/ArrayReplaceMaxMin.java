package com.nina.hw2;

public class ArrayReplaceMaxMin {
    public static int[] replaceMaxMin(int[] a) {
        int max = findMaxArray(a);
        int min = findMinArray(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = min;
            } else {
                if (a[i] == min) {
                    a[i] = max;
                }
            }
        }
        return a;
    }

    public static int findMaxArray(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int findMinArray(int[] a) {
        int min = 500_000_000;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
