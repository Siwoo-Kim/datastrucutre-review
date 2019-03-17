package com.siwoo.datastructure.sort;

import com.siwoo.datastructure.Example;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = Example.getExample();
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end - start < 2)
            return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int el = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && array[--j] >= el) ;
            if (i < j)
                array[i] = array[j];
            while (i < j && array[++i] <= el) ;
            if (i < j)
                array[j] = array[i];
        }
        array[j] = el;
        return j;
    }

}
