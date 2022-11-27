package Practise;

public class FoundInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak=peakIndexInMountainArray(arr);
        int firsttry=Order_Acnoustic(arr, target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return Order_Acnoustic(arr, target, peak+1, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // We are currently is in the decreasing part of an array
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // We can return end also cuz the start and the end element are the same
    }

    static int Order_Acnoustic(int[] arr, int target, int start, int end) 
    {

            // Means we are searching an element which is greater than the largest number
        // of an array and hence the element doesn't lie in that array 
        if(target>arr[end]){
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;

    }
}

