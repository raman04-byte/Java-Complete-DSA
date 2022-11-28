package DSA_Questions;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,12,6,4,43,56,3,8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


}
