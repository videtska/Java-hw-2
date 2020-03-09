package com.nina.hw2;

public class ArrayComposition {
    public static void arrCompose(int[] a, int m) {
        int size = a.length;
        int count = 0;
        int res = 1;
        for (int i = 0; i < size; i++) {
            if (a[i] > m) {
                res *= a[i];
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No such elements");
        } else {
            System.out.println("Comp is: " + res);
        }
    }
}
