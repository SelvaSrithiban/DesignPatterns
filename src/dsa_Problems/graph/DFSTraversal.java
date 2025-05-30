package dsa_Problems.graph;

import java.util.ArrayList;

public class DFSTraversal {

    public static void rec(ArrayList<Integer>[] graph, int startNode, boolean[] visitor, ArrayList<Integer> ans){

        //set the visitor to true
        visitor[startNode] = true;
        //add node to the result
        ans.add(startNode);
        ArrayList<Integer> list = graph[startNode];

        //Traverse through the neighbour
        for(int nbr : list){
            if(visitor[nbr] == false){
                //explore the sub-neighbours
                rec(graph, nbr, visitor, ans);
            }
        }
        
    }

    public static ArrayList<Integer> dfsTraversal(ArrayList<Integer>[] graph, int startNode){

        int n = graph.length;
        System.out.println(n);
        //create a visitor array
        boolean[] visitor = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        //Works for both connected and Disconnected graphs
        for (int i = 0; i < n; i++) {
            if (visitor[i] == false) {
                rec(graph, i, visitor, ans);
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
            {0, 1},
            {1, 2},
            {2, 3},
            {1, 4},
            {5, 6},
            {6, 7}
        };

        ArrayList<Integer>[] graph = directedGraph(edges);
        ArrayList<Integer> ans = dfsTraversal(graph, 0);
        System.out.println(ans);
        
    }

}
