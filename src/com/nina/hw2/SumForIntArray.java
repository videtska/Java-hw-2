package com.nina.hw2;

public class SumForIntArray {
    public static int sumForIntArrayK(int[] a, int k) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) sum += a[i];
        }
        return sum;
    }
}
