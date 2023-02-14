package GFGPOTD;

public class Feb_14 {
    public static void main(String[] args) {

    }

    int minCost(int[][] colors, int N) {

        // Write your code here

        for (int i = 1; i < N; i++) {

            colors[i][0] += Math.min(colors[i - 1][1], colors[i - 1][2]);

            colors[i][1] += Math.min(colors[i - 1][0], colors[i - 1][2]);

            colors[i][2] += Math.min(colors[i - 1][1], colors[i - 1][0]);

        }

        return Math.min(colors[N - 1][1], Math.min(colors[N - 1][0], colors[N - 1][2]));
    }
}
