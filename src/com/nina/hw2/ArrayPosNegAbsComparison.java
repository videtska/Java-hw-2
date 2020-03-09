package com.nina.hw2;

import org.w3c.dom.ls.LSOutput;

import java.awt.event.MouseAdapter;

public class ArrayPosNegAbsComparison {
    public static void greaterAbs (int[] a) {
        int compPos;
        int compNeg;

        compNeg = findCompNegative(a);
        compPos = findCompPositive(a);

        boolean res = Math.abs(compNeg) > Math.abs(compPos);
        if (res) {
            System.out.println("Composition of negative elements is greater by abs");
        } else {
            System.out.println("Composition of positive elements is greater by abs");
        }
    }

    public static int findCompPositive (int[] a) {
        int size = a.length;
        int res = 1;
        for (int i = 0; i < size; i++) {
            if (a[i] > 0) {
                res *= a[i];
            }
        }
        return res;
    }

    public static int findCompNegative (int[] a) {
        int size = a.length;
        int res = 1;
        for (int i = 0; i < size; i++) {
            if (a[i] < 0) {
                res *= a[i];
            }
        }
        return res;
    }
}
