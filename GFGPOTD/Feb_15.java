package GFGPOTD;

public class Feb_15 {
    public static void main(String[] args) {

    }

    int water_flow(int[][] mat, int n, int m) {

        boolean[][] indian = new boolean[n][m];
        for (int i = 0; i < n; i++)
            dfs(mat, i, 0, -1, n, m, indian);
        for (int i = 0; i < m; i++)
            dfs(mat, 0, i, -1, n, m, indian);

        boolean[][] arabian = new boolean[n][m];
        for (int i = 0; i < n; i++)
            dfs(mat, i, m - 1, -1, n, m, arabian);
        for (int i = 0; i < m; i++)
            dfs(mat, n - 1, i, -1, n, m, arabian);

        int cnt = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (indian[i][j] && arabian[i][j])
                    cnt++;
            }

        return cnt;
    }

    private int[] dx = new int[] { 0, 0, -1, 1 };
    private int[] dy = new int[] { -1, 1, 0, 0 };

    void dfs(int[][] mat, int i, int j, int prev, int n, int m, boolean[][] canTravel) {
        if (i < 0 || j < 0 || i >= n || j >= m || canTravel[i][j] || mat[i][j] < prev)
            return;
        canTravel[i][j] = true;
        for (int k = 0; k < 4; k++)
            dfs(mat, i + dx[k], j + dy[k], mat[i][j], n, m, canTravel);
    }
}
