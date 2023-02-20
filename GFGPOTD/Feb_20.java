package GFGPOTD;

public class Feb_20 {
    public static void main(String[] args) {

    }

    public static int countPaths(int N) {
        int count = 0;
        int mod = 1000000007;
        long curr = 1;
        long prev = 0;
        if (N == 1)
            return 0;
        if (N == 2)
            return 3;
        for (int i = 3; i <= N; i++) {
            int temp = (int) curr;
            curr = (2 * curr + 3 * prev) % mod;
            prev = temp;
        }
        count = (int) ((3 * curr) % mod);

        return count;

    }
}
