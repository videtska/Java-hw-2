package com.nina.hw2;

import java.util.Scanner;

public class ReadAnArray {
    public static int[] readIntArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
