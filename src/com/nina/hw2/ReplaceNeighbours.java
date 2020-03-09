package com.nina.hw2;

import com.sun.source.tree.BreakTree;

public class ReplaceNeighbours {
    public static int[] replaceNeib(int[] a) {
        int p = 0;
        int size = a.length;
        for (int i = 0; i < size - 1; i++) {
            p = a[i];
            a[i] = a[i+1];
            a[i+1] = p;
            i++;
        }
        return a;
    }
}
