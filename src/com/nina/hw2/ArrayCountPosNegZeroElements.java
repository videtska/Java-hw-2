package com.nina.hw2;

public class ArrayCountPosNegZeroElements {
    public static int[] countDiffElems(int[] a) {
        int[] countArr = new int[3];
        int size = a.length;

        for (int i = 0; i < size; i++) {
            if (a[i] > 0) {
                countArr[0]++;
            } else {
                if (a[i] < 0) {
                    countArr[1]++;
                } else countArr[2]++;
            }
        }
        return countArr;
    }
}
