// LeetCode question 26
public class LeetCode_26 {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] arr) {
        int length = arr.length;
        if (length == 0 || length == 1) {
            return length;
        }
        int[] temp = new int[length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[length - 1];
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }
}
