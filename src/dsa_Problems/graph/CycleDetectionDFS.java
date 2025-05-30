package dsa_Problems.graph;

import java.util.ArrayList;

public class CycleDetectionDFS {
    public boolean rec(ArrayList<Integer>[] graph, int startNode, boolean[] visitor, boolean[] path){

        //set the visitor and path to true
        visitor[startNode] = true;
        path[startNode] = true;
        //extract the ArrayList from graph
        ArrayList<Integer> list = graph[startNode];

        //Traverse through the list
        for(int nbr : list){
            //check if the nbr is present in the path
            if(path[nbr] == true){
                return true;
            }
            //make a call to sub-neoghbours
            if(!visitor[nbr]){
                if(rec(graph, nbr, visitor, path)){
                    return true;
                }
            }
        }
        //set the path to false while backtracking
        path[startNode] = false;

        return false;
    }

    public int dfsTraversal(ArrayList<Integer>[] graph){

        int n = graph.length;
        //create visitor Array
        boolean[] visitor = new boolean[n];
        //create path Array
        boolean[] path = new boolean[n];
        
        //Traverse through the visitor Array
        for(int i = 1; i < n; i++){
            if(visitor[i] == false){
                if(rec(graph, i, visitor, path) == true){
                    return 1;
                }
            }
        }
        return 0;
    }

    public ArrayList<Integer>[] createGraph(int nodes, int[][] edges){

        //create Array of ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[nodes + 1];
        for(int i = 0; i <= nodes; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
        }

        return graph;

    }
    public int solve(int A, int[][] B) {

        //create graph
        ArrayList<Integer>[] graph = createGraph(A, B);
        //perfrom DFS traversal and check cycle
        int ans = dfsTraversal(graph);

        return ans;
    }
}
