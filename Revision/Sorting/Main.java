package Revision.Sorting;

import java.util.Arrays;

//  This will be the main file and I am going to use some OOPS concept
public class Main {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        // bubbleSort bb = new bubbleSort();
        // bb.bubble(arr);
        // cyclicSort cc=new cyclicSort();
        // cc.cyclicsort(arr);
        // insertionSort ins=new insertionSort();
        // ins.insetion(arr);
        // quickSort qs=new quickSort();
        // qs.quick(arr, 0, arr.length-1);
        Merge_Sort mg=new Merge_Sort();
        arr = mg.mergeSS(arr);
        System.out.println(Arrays.toString(arr));
    }
}
