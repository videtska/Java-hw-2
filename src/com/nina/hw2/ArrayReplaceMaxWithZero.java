package com.nina.hw2;

public class ArrayReplaceMaxWithZero {
    public static int[] replaceFirstMax (int[] a) {
        int max = ArrayReplaceMaxMin.findMaxArray(a);
        int size = a.length;
        for (int i = 0; i < size; i++) {
            if (a[i] == max) {
                a[i] = 0;
                break;
            }
        }
        return a;
    }
}
