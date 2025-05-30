package dsa_Problems.graph;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class PathinDirectedGraph {

    public int solve(int A, int[][] B) {

         // Step 1: Build the graph
        List<Integer>[] graph = new ArrayList[A + 1];
        for (int i = 1; i <= A; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : B) {
            graph[edge[0]].add(edge[1]);
        }

        // Step 2: Use BFS to check reachability from 1 to A
        boolean[] visited = new boolean[A + 1];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        visited[1] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == A) {
                return 1; // Found a path from 1 to A
            }

            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        return 0; // No path found

    }

}
