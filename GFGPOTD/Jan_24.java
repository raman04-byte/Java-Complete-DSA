package GFGPOTD;

import java.util.Arrays;

public class Jan_24 {
    void convert(int[] arr, int n) {
        int temp[] = new int[n], eg[] = new int[n], x = 0;

        for (int i = 0; i < n; i++)
            temp[i] = arr[i];
        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            x = binary_Search(temp, 0, n - 1, arr[i]);
            eg[i] = x;
        }

        for (int i = 0; i < n; i++)
            arr[i] = eg[i];

    }

    // binary search function
    int binary_Search(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binary_Search(arr, l, mid - 1, x);
            return binary_Search(arr, mid + 1, r, x);
        }
        return -1;
    }
}
