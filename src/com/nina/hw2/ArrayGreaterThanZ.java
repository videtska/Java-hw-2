package com.nina.hw2;

public class ArrayGreaterThanZ {
    public static int[] arrayGreaterThanZ(int[] a, int z) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                counter++;
            }
        }
        return a;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void printArrayTillZero(int[] a) {
        int size = a.length;
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
            if (a[i] == 0) {
                break;
            }
        }
    }
}
