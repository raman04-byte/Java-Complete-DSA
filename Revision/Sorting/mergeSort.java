package Revision.Sorting;

import java.util.Arrays;

public class mergeSort {
    int[] mergeSS(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] first = mergeSS(Arrays.copyOfRange(arr, 0, mid));
        int[] second = mergeSS(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first, second);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;

        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (k < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
