// LeetCode question 1470
public class LeetCode_1470 {
    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {
        int count = 0;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[count] = nums[i];
            arr[count + 1] = nums[i + n];
            count += 2;
        }
        return arr;
    }

}
