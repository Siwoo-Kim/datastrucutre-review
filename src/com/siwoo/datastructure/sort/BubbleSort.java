package com.siwoo.datastructure.sort;

import com.siwoo.datastructure.Example;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] p) {
        int[] arrays = Example.getExample();

        for (int unsorted = arrays.length - 1; unsorted > 0; unsorted--) {
            //bubbling largest value into the last position in unsorted partition.
            //After inner loop, last position of the unsorted partition will be sorted partition.
            for (int i = 0; i < unsorted; i++) {
                if (arrays[i] > arrays[i + 1]) {
                    int t = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
        arrays = Example.getExample();
        for (int unsorted = arrays.length - 1; unsorted > 0; unsorted--) {
            //while 문으로 바꿔보기
//            for (int i = 0; i < unsorted; i++) {
//                if (arrays[i] > arrays[i + 1]) {
//                    int tmp = arrays[i];
//                    arrays[i] = arrays[i + 1];
//                    arrays[i + 1] = tmp;
//                }
//            }
            int i = 0;
            while (i < unsorted) {
                if (arrays[i] > arrays[i + 1]) {
                    int t = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = t;
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arrays));
        //descending 으로 sort 해보기
        arrays = Example.getExample();
        for (int unsorted = arrays.length - 1; unsorted > 0; unsorted--) {
            int i = 0;
            while (i < unsorted) {
                if (arrays[i] < arrays[i + 1]) {
                    int t = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = t;
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arrays));
        //sorted partition 을 left 로 해서 sort 해보기.
        for (int unsorted = 0; unsorted < arrays.length; unsorted++) {
            for (int i = arrays.length - 1; i > unsorted; i--) {
                if (arrays[i] < arrays[i - 1]) {
                    int t = arrays[i];
                    arrays[i] = arrays[i - 1];
                    arrays[i - 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
