// Binary Search Implementation in Descedning Order
package DSA_Questions;

public class BinarySearchInDescendingOrder {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target=7;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);

    }

    static int BinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        // Checking if the array is in ascending order or not
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
}
