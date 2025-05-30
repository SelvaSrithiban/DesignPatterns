package dsa_Problems.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {

    public static ArrayList<Integer> topologicalSortRight(ArrayList<Integer>[] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        // Call DFS for all unvisited nodes
        for (int i = 1; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, stack);
            }
        }

        // Pop from stack to get right-to-left topological order
        ArrayList<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }

        return ans;
    }

    private static void dfs(int node, ArrayList<Integer>[] graph, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;
        for (int nbr : graph[node]) {
            if (!visited[nbr]) {
                dfs(nbr, graph, visited, stack);
            }
        }
        // Add node to stack after visiting all neighbors
        stack.push(node);
    }

    public static ArrayList<Integer> topologicalSortLeft(ArrayList<Integer>[] graph){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = graph.length;
        //calculate indegree for all the nodes
        int[] indegree = new int[n];
        for(int i = 0; i < n; i++){
            for(int nbr : graph[i]){
                indegree[nbr] = indegree[nbr]+1;
            }
        }

        //create queue and update the indegree with 0
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 1; i < indegree.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        while(q.size()>0){
            //remove the peek element
            int peek = q.poll();
            //add it to the list
            ans.add(peek);

            //traverse the neighbour
            for(int nbr : graph[peek]){
                //reduce the indegree
                indegree[nbr] = indegree[nbr]-1;
                //add to the queue if indegree is 0
                if(indegree[nbr] == 0){
                    q.add(nbr);
                }
            }
        }

        return ans;
    }

    public static ArrayList<Integer>[] directedGraph(int[][] edges){

        //Compute length
        int maxNode = 0;
        for(int[] edge : edges){
            maxNode = Math.max(maxNode, Math.max(edge[0],edge[1]));
        }
        int n = maxNode + 1;
        System.out.println("the size of graph " + n);
        //create Array of list
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        /*for(int i = 0; i < n; i++){
            //extract starting point
            int s = edges[i][0];
            int e = edges[i][1];
            graph[s].add(e);
        }*/

        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
        }
        
        return graph;
    }


    public static void main(String[] args) {
        
    int[][] edges = {
        {1, 2},
        {1, 4},
        {2, 3},
        {3, 5},
        {3, 6},
        {4, 5},
        {5, 6},
        {7, 4},
        {7, 6}
    };

    ArrayList<Integer>[] graph = directedGraph(edges);
        for (int i = 0; i < graph.length; i++) {
        System.out.println(i + " -> " + graph[i]);
         }
    ArrayList<Integer> topoSortedList = topologicalSortLeft(graph);
    System.out.println(topoSortedList);
     ArrayList<Integer> topoSortedList1 = topologicalSortRight(graph);
    System.out.println(topoSortedList1);  
    }
    
}
