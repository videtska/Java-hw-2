package com.nina.hw2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /***********1.FindMin**********************
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(FindMin.findMin(a,b));*/

        /**************2.ArraySumK*****************
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(SumForIntArray.sumForIntArrayK(ReadAnArray.readIntArray(n), k));*/

        /**********3.ArrayWithZeroIndex************
        int n = sc.nextInt();
        ArrayWithZero.printArr(ArrayWithZero.arrayWithZero(ReadAnArray.readIntArray(n)));*/

        /**********4.FirstInArrayPosNeg************
        int n = sc.nextInt();
        PosNegFirst.firstPosNeg(ReadAnArray.readIntArray(n));*/

        /***************5.IsSorted*****************
        int n = sc.nextInt();
        IsSortedAsc.isSortedAsc(ReadAnArray.readIntArray(n));*/

        /*************6.ArrayWithEvenOnly**********
        int n = sc.nextInt();
        ArrayWithZero.printArr(ArrayWithZero.arrayWithEven(ReadAnArray.readIntArray(n)));*/

        /*************7.ArrayGreateThanZ***********
        int n = sc.nextInt();
        int z = sc.nextInt();
        ArrayGreaterThanZ.printArray(ArrayGreaterThanZ.arrayGreaterThanZ(ReadAnArray.readIntArray(n),z));*/

        /*************8.CountPosNegZero************
        int n = sc.nextInt();
        ArrayGreaterThanZ.printArray(ArrayCountPosNegZeroElements.countDiffElems(ReadAnArray.readIntArray(n)));*/

        /**************9.ReplaceMaxMin*************
        int n = sc.nextInt();
        ArrayGreaterThanZ.printArray(ArrayReplaceMaxMin.replaceMaxMin(ReadAnArray.readIntArray(n)));*/

        /****************10.PrintLessThanI**************
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayWithZero.printArr(PrintSomeElements.getSome(ReadAnArray.readIntArray(n), k));*/

        /***********11.PrintSomeDivided*****************
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        ArrayWithZero.printArr(PrintSomeElements.getSomeDivide(ReadAnArray.readIntArray(n),m,k));*/

        /*************12.ReplaceNeighbours**************
        int n = sc.nextInt();
        ArrayGreaterThanZ.printArray(ReplaceNeighbours.replaceNeib(ReadAnArray.readIntArray(n)));*/

        /**************13.PrintTillZero*****************
        int n = sc.nextInt();
        ArrayGreaterThanZ.printArrayTillZero(ReadAnArray.readIntArray(n));*/

        /***********14.SplitArrAndSumMaxMin*************
        int n = sc.nextInt();
        SplitAnArray.arraySplit(ReadAnArray.readIntArray(n));*/

        /*********15.ArrayCompWhenGreaterThanM**********
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayComposition.arrCompose(ReadAnArray.readIntArray(n),m);*/

        /***********16.ReplaceWithZeroUsingAbs**********
        int n = sc.nextInt();
        ArrayGreaterThanZ.printArray(ArrayReplaceWithZeroAbs.replaceWithZeroAbs(ReadAnArray.readIntArray(n)));*/

        /************17.ArrayPosNegAbsComparison**********
        int n = sc.nextInt();
        ArrayPosNegAbsComparison.greaterAbs(ReadAnArray.readIntArray(n));*/

        /*************18.ReplaceFirstMaxWithZero**********
        int n = sc.nextInt();
        ArrayGreaterThanZ.printArray(ArrayReplaceMaxWithZero.replaceFirstMax(ReadAnArray.readIntArray(n)));*/

        /*******************19.ArrayWithK*****************
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayWithZero.printArr(ArrayLastNumberK.arrayWithKasLastNUmber(ReadAnArray.readIntArray(n), k));*/
    }
}
