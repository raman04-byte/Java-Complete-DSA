// Using the Binary Search in finding the ceiling of a number in an array
package Practise;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8 };
        int target = 2;
        // We are returning the index of the value in Ceiling
        int ans = Ceiling_using_Binary_Search(arr, target);
        System.out.println(ans);
    }

    static int Ceiling_using_Binary_Search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

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


// Ignore this comment
// 47:00