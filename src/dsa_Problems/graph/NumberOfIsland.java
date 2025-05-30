package dsa_Problems.graph;


public class NumberOfIsland {
    static int[] dx = new int[] {0, 1, -1, 0, 1, -1, 1, -1};
    static int[] dy = new int[] {1, 0, 0, -1, -1, 1, 1, -1};
    static int tc = 0;
    static int[][] visited = new int[105][105];
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        ++tc;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 1 && visited[i][j] != tc) {
                    dfs(i, j, n, m, A);
                    ans++;
                }
            }
        }
        return ans;
    }
    public static boolean check(int i, int j, int n, int m, int[][] A) {
        return (i >= 0 && i < n && j >= 0 && j < m && (A[i][j] == 1) && visited[i][j] != tc);
    }
    public static void dfs(int i, int j, int n, int m, int[][] A) {
        visited[i][j] = tc;
        int di, dj;
        for (int k = 0; k < 8; ++k) {
            di = i + dx[k];
            dj = j + dy[k];
            if (check(di, dj, n, m, A))
                dfs(di, dj, n, m, A);
        }
    }
}