package Practise;

public class MountainArray {
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[] arr) {
     int start = 0;
     int end = arr.length-1;
     while(start<end){
        int mid = start + (end-start)/2;
        if(arr[mid]>arr[mid+1]){
            // We are currently is in the decreasing part of an array
            end=mid;
        }else{
            start=mid+1;
        }
     }
     return start; // We can return end also cuz the start and the end element are the same
    }
}