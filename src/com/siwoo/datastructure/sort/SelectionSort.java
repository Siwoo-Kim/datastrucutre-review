package com.siwoo.datastructure.sort;

import com.siwoo.datastructure.Example;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = Example.getExample();
        for (int unsorted = array.length - 1; unsorted > 0; unsorted--) {
            int largest = 0;
            for (int i = 0; i <= unsorted; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            int tmp = array[largest];
            array[largest] = array[unsorted];
            array[unsorted] = tmp;
        }
        System.out.println(Arrays.toString(array));
        array = Example.getExample();
        //while
        for (int unsorted = array.length - 1; unsorted > 0; unsorted--) {
            int largest = 0, i = 0;
            while (i <= unsorted) {
                if (array[largest] < array[i])
                    largest = i;
                i++;
            }
            int tmp = array[largest];
            array[largest] = array[unsorted];
            array[unsorted] = tmp;
        }
        System.out.println(Arrays.toString(array));
        array = Example.getExample();
        //descending
        for (int unsorted = array.length - 1; unsorted > 0; unsorted--) {
            int smallest = 0, i = 0;
            while (i <= unsorted) {
                if (array[smallest] > array[i])
                    smallest = i;
                i++;
            }
            int tmp = array[smallest];
            array[smallest] = array[unsorted];
            array[unsorted] = tmp;
        }
        System.out.println(Arrays.toString(array));
        array = Example.getExample();
        //reverse unsorted and sorted
        for (int unsorted = 0; unsorted < array.length; unsorted++) {
            int smallest = array.length - 1, i = array.length - 1;
            while (i >= unsorted) {
                if (array[i] < array[smallest])
                    smallest = i;
                i--;
            }
            int tmp = array[smallest];
            array[smallest] = array[unsorted];
            array[unsorted] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
