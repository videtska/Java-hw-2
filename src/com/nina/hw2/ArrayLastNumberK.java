package com.nina.hw2;

import java.util.ArrayList;

public class ArrayLastNumberK {
    public static ArrayList<Integer> arrayWithKasLastNUmber (int[] a, int k) {
        int size = a.length;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (a[i] % 10 == k) {
                res.add(a[i]);
            }
        }
        return res;
    }
}
