package com.nina.hw2;

public class ArrayReplaceWithZeroAbs {
    public static int[] replaceWithZeroAbs(int[] a) {
        int max = ArrayReplaceMaxMin.findMaxArray(a);
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i]) > max) {
                a[i] = 0;
            }
        }
        return a;
    }
}
