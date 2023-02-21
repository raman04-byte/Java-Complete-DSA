public class Feb_21 {
    public static void main(String[] args) {

    }

    public static int minIteration(int N, int M, int x, int y) {
        int top = x - 1, down = N - x;
        int left = y - 1, right = M - y;
        return Math.max(top + left, Math.max(top + right, Math.max(down + left, down + right)));
    }
}
