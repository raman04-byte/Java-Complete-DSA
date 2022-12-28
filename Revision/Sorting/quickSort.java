package Revision.Sorting;

public class quickSort {
    public void quick(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int s=start;
        int e=end;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(pivot<arr[e]){
                e--;
            }if(s<=e){
                swap(arr, s, e);
            s++;e--;}

        }
        quick(arr, start, e); 
        quick(arr, s, end); 
    }
    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
