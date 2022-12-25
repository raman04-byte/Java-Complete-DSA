package Revision.Sorting;

import java.util.Arrays;

//  This will be the main file and I am going to use some OOPS concept
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,5,23,6,4};
        bubbleSort bb = new bubbleSort();
        bb.bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
