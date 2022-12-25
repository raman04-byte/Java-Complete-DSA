package Revision.Sorting;

import java.util.Arrays;

//  This will be the main file and I am going to use some OOPS concept
public class Main {
    public static void main(String[] args) {
        int arr[] = {5,4,3,6,7,8,9,2,1};
        // bubbleSort bb = new bubbleSort();
        // bb.bubble(arr);
        cyclicSort cc=new cyclicSort();
        cc.cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
