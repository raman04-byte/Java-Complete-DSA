public class LeetCode_198 {
    public static void main(String[] args) {

    }

    public int rob(int[] arr) {
        int prevNo = 0;
        int nextNo = 0;
        for (int nums : arr) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, nextNo);
            nextNo = nums + temp;
        }
        return Math.max(prevNo, nextNo);
    }
}