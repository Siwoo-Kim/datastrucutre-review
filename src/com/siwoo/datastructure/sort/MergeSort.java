package com.siwoo.datastructure.sort;

import com.siwoo.datastructure.Example;
import org.omg.CORBA.ARG_IN;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = Example.getExample();
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        mergeSort(array, 0, array.length);
        //descending
        mergeSortDesc(array, 0, array.length);
    }

    private static void mergeSortDesc(int[] array, int start, int end) {
        if (end - start < 2)
            return;
        int mid = (start + end) / 2;
        mergeSortDesc(array, start, mid);
        mergeSortDesc(array, mid, end);
        mergeDesc(array, start, mid, end);
    }

    private static void mergeDesc(int[] array, int start, int mid, int end) {
        if (array[mid - 1] > array[mid])
            return;
        int[] tmp = new int[end - start];
        int index = 0;
        int i = start;
        int j = mid;
        while (i < mid && j < end) {
            //is stable?
            //{4, 2} {6, 2}
            //{6, 4, i:2} = stable
            tmp[index++] = array[i] >= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start + index, mid - i);
        System.arraycopy(tmp, 0, array, start, index);
    }

    private static void mergeSort(int[] array, int start, int end) {
        //end point of the recursion
        if (end - start < 2) {
            return;
        }
        //splitting phase, split left array first then split right array.
        //splitting phase looks like similar with binary tree
        int mid = (start + end) / 2;
        //split left array
        mergeSort(array, start, mid);
        //split right array
        mergeSort(array, mid, end);
        //merging logical left and right array
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        //mid - 1 = last element of the left array.
        //mid = first element of the right array.
        //Since the two arrays are sorted, if the last element in the left array is less than the first element in the right array
        //it is already in sorted position.
        if (array[mid - 1] < array[mid])
            return;
        int[] tmp = new int[end - start];
        int index = 0;
        int i = start;
        int j = mid;
        while (i < mid && j < end) {
            tmp[index++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        //copy the remain left elements into the last portion of the original array.
        System.arraycopy(array, i, array, start + index, mid - i);
        System.arraycopy(tmp, 0, array, start, index);
    }
}
