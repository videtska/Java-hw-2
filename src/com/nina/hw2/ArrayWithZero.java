package com.nina.hw2;

import java.util.ArrayList;

public class ArrayWithZero {
    public static ArrayList<Integer> arrayWithZero(int[] a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                res.add(i);
            }
        }
        return res;
    }

    public static ArrayList<Integer> arrayWithEven(int[] a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                res.add(a[i]);
            }
        }
        return res;
    }

    public static void printArr (ArrayList<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            System.out.println("No such elements!");
        } else {
            for (int i : arrayList)
                System.out.print(i + " ");
        }
    }
}
