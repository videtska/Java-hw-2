package com.nina.hw2;

public class SplitAnArray {
    public static void arraySplit(int[] a) {
        int size = a.length;
        int size_even = size / 2 + size % 2;
        int size_noteven = size / 2 ;

        int[] arr_even = new int[size_even];
        int[] arr_noteven = new int[size_noteven];

        int tmp = 0;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                arr_even[tmp] = a[i];
                tmp++;
                if (tmp == size_even) break;
            }
        }

        tmp = 0;
        for (int j = 0; j < size; j++) {
             if (j % 2 != 0) {
                 arr_noteven[tmp] = a[j];
                 tmp++;
                 if (tmp == size_noteven) break;
             }
        }

        int j = ArrayReplaceMaxMin.findMaxArray(arr_even);
        int b = ArrayReplaceMaxMin.findMinArray(arr_noteven);

        int sum = j + b;
        System.out.println(sum);
    }
}
