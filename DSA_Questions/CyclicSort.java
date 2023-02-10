// Cyclic Sort Implementation using methods in java
package DSA_Questions;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
