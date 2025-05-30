package dsa_Problems.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFSTraversal {

    //for connected nodes
    //for connected and disconnected nodes
    public static ArrayList<Integer> bfsTraversal1(ArrayList<Integer>[] graph, int startNode){

        int n = graph.length;
        //create visitor array, queue and list
        boolean[] visitor = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        //add the first src element and 
        q.add(startNode);
        //update visitor 
        visitor[startNode] = true;

        while(q.size()>0){
            //remove the peek element
            int node = q.poll();
            //add to the list
            ans.add(node);
            //traverse through the neighbour
            for(int nbr : graph[node]){
                if(!visitor[nbr]){
                    visitor[nbr] =  true;
                    //add it to queue
                    q.add(nbr);
                }
            }
        }

        return ans;
    }


    //for connected and disconnected nodes
    public static ArrayList<Integer> bfsTraversal(ArrayList<Integer>[] graph, int startNode){

        int n = graph.length;
        //create visitor array, queue and list
        boolean[] visitor = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i = startNode; i < n; i++){
          if(!visitor[i]){
            //add the first src element and 
            q.add(i);
            //update visitor 
            visitor[i] = true;

            while(q.size()>0){
                //remove the peek element
                int node = q.poll();
                //add to the list
                ans.add(node);
                //traverse through the neighbour
                for(int nbr : graph[node]){
                    if(!visitor[nbr]){
                        visitor[nbr] =  true;
                        //add it to queue
                        q.add(nbr);
                    }
                }
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
            {4, 1},
            {2, 4},
            {3, 4},
            {5, 2},
            {1, 3}
        };

        ArrayList<Integer>[] graph = directedGraph(edges);
        for (int i = 0; i < graph.length; i++) {
        System.out.println(i + " -> " + graph[i]);
         }
        ArrayList<Integer> ans = bfsTraversal(graph, 1);
        System.out.println(ans);
        
    }

}
