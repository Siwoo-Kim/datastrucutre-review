package com.siwoo.datastructure.sort;

import com.siwoo.datastructure.Example;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = Example.getExample();
        for (int sorted = 1; sorted < array.length; sorted++) {
            int el = array[sorted];
            int i = sorted;
            while (i > 0 && array[i - 1] > el) {
                array[i] = array[i - 1];
                i--;
            }
            array[i] = el;
        }
        System.out.println(Arrays.toString(array));
        //for-inner loop
        array = Example.getExample();
        for (int sorted = 1; sorted < array.length; sorted++) {
            int el = array[sorted];
            int i = sorted;
            for (; i > 0 && array[i - 1] > el; i--) {
                array[i] = array[i - 1];
            }
            array[i] = el;
        }
        System.out.println(Arrays.toString(array));
        array = Example.getExample();
        //reversed sorted partition with unsorted partition.
        for (int sorted = (array.length - 1) - 1; sorted >= 0; sorted--) {
            int el = array[sorted];
            int i = sorted;
            while (i < array.length - 1 && array[i + 1] < el) {
                array[i] = array[i + 1];
                i++;
            }
            array[i] = el;
        }
        System.out.println(Arrays.toString(array));
        //descending
        for (int sorted = (array.length - 1) - 1; sorted >= 0; sorted--) {
            int el = array[sorted];
            int i = sorted;
            while (i < array.length - 1 && array[i + 1] > el) {
                array[i] = array[i + 1];
                i++;
            }
            array[i] = el;
        }
        System.out.println(Arrays.toString(array));

        array = Example.getExample();
        //using gap do shell sort.
        //gap value : i = array.length / 2
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int sorted = gap; sorted < array.length; sorted++) {
                int el = array[sorted];
                int i = sorted;
                // (i - gap >= 0) == (i >= gap)
                while (i >= gap && array[i - gap] > el) {
                    array[i] = array[i - gap];
                    i -= gap;
                }
                array[i] = el;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}



























