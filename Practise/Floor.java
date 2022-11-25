// Using the Binary Search in finding the ceiling of a number in an array
package Practise;

public class Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        // We are returning the index of the value in Floor
        int ans = Floor_using_Binary_Search(arr, target);
        System.out.println(ans);
    }

    static int Floor_using_Binary_Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
        return end;

    }
}
