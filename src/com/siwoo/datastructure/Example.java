package com.siwoo.datastructure;

import java.util.Arrays;

public class Example {

    private static int[] arrays;

    private Example() { }

    private static void init() {
        arrays = new int[7];
        arrays[0] = 20; // (0 * int size) + address
        arrays[1] = 35; // (1 * int size) + address
        arrays[2] = -15; // (2 * int size) + address
        arrays[3] = 7; // (3 * int size) + address
        arrays[4] = 55; // (4 * int size) + address
        arrays[5] = 1; // (5 * int size) + address
        arrays[6] = -22; // (6 * int size) + address
    }

    public static int[] getExample() {
        if (arrays == null) {
            synchronized (Example.class) {
                if (arrays == null)
                    init();
            }
        }
        return Arrays.copyOf(arrays, arrays.length);
    }

}
