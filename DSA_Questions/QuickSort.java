package DSA_Questions;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = {4,3,2,1};
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int s = start;
        int e = end;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (pivot < arr[e]) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick(arr, start, e);
        quick(arr, s, end);
    }
}
