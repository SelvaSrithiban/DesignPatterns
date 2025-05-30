package dsa_Problems.graph;

public class MultiSourceBfs {
    static int maxn = 200009;
    static int[] vis = new int[maxn];
    static ArrayList < ArrayList < Integer > > adj;
    public static void graph() {
        adj = new ArrayList < ArrayList < Integer > > (maxn);
        for (int i = 0; i < maxn; i++) {
            vis[i] = 0;
            adj.add(new ArrayList < Integer > ());
        }
    }
    public int solve(int A, int[][] B, int C, int D) {
        graph();
        int n = A;
        for (int[] it: B) {
            int x = it[0];
            int y = it[1];
            int w = it[2];
            if (w == 1) {
                adj.get(x).add(y);
                adj.get(y).add(x);
            } else {
                adj.get(x).add(x + n);
                adj.get(x + n).add(y);
                adj.get(y).add(y + n);
                adj.get(y + n).add(x);
            }
        }
        return bfs(C, D);
    }
    public static int bfs(int source, int destination) {
        vis[source] = 1;
        Queue < Pair > q = new ArrayDeque < Pair > ();
        q.offer(new Pair(source, 0));
        while (q.size() > 0) {
            Pair p = q.poll();
            int x = p.ff;
            int w = p.ss;
            if (x == destination)
                return w;
            for (int v: adj.get(x)) {
                if (vis[v] == 0) {
                    vis[v] = 1;
                    q.offer(new Pair(v, w + 1));
                }
            }
        }
        return -1;
    }
}
class Pair {
    int ff;
    int ss;
    public Pair(int a, int b) {
        this.ff = a;
        this.ss = b;
    }
}