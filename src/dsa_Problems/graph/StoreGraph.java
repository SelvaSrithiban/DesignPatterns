package dsa_Problems.graph;

import dynamicProgramming.ArrayList;

public class StoreGraph {

    class Pair{
        int value;
        int end;
        Pair(int end, int value){
            this.value = value;
            this.end = end;
        }
    }

    public ArrayList<Integer>[] directedGraph(int[][] A){

        int n = A.length;

        //create Array of list
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < n; i++){
            //extract starting point
            int s = A[i][0];
            int e = A[i][1];
            graph[s].add(e);
        }
        
        return graph;
    }
    

    public ArrayList<Integer>[] unDirectedGraph(int[][] A){

        int n = A.length;

        //create Array of list
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < n; i++){
            //extract starting point
            int s = A[i][0];
            int e = A[i][1];
            graph[s].add(e);
            graph[e].add(s);
        }
        
        return graph;
    }

    public ArrayList<Integer>[] weightedGraph(int[][] A){

        int n = A.length;

        //create Array of list
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < n; i++){
            //extract starting point
            int s = A[i][0];
            int e = A[i][1];
            int v = A[i][2];
            Pair p = new Pair(e, v);
            graph[s].add(p);
        }
        
        return graph;
    }

}
