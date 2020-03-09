package com.nina.hw2;

import java.util.ArrayList;

public class PrintSomeElements {
    public static ArrayList<Integer> getSome(int[] a, int k) {
        int size = a.length;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (a[i] <= k) {
                res.add(a[i]);
            }
        }
        return res;
    }

    public static ArrayList<Integer> getSomeDivide(int[] a, int k, int m) {
        int size = a.length;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (a[i] % k == m) {
                res.add(a[i]);
            }
        }
        return res;
    }
}
