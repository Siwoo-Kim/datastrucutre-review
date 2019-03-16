package com.siwoo.datastructure.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] pa) {
        int[] arrays = new int[7];
        arrays[0] = 20; // (0 * int size) + address
        arrays[1] = 35; // (1 * int size) + address
        arrays[2] = -15; // (2 * int size) + address
        arrays[3] = 7; // (3 * int size) + address
        arrays[4] = 55; // (4 * int size) + address
        arrays[5] = 1; // (5 * int size) + address
        arrays[6] = -22; // (6 * int size) + address
        //last element = length of array - 1;

        for (int i = 0; i < arrays.length; i++)
            System.out.println(arrays[i]);

        //Retrieve the item when you know the index.
        //O(1)
        System.out.println(String.format("value = %d", arrays[3]));
        //search without knowing index of the item.
        //O(n) = arrays length influences the number of the steps to perform
        int index = -1;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println(String.format("index = %d", index));

        //add an element to a full array.
        int el = 88;
        int[] newArray = new int[arrays.length * 2];
        int size = arrays.length;
        for (int i = 0; i < arrays.length; i++) {
            newArray[i] = arrays[i];
        }
        newArray[size++] = el;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == el) {
                index = i;
                break;
            }
        }
        System.out.println(String.format("Index of new element %d", index));
        newArray[size++] = 99;
        System.out.println(String.format("Index of new element %d", size - 1));
        int i = 2;
        while (i < size) {
            newArray[i] = newArray[i + 1];
            i++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
