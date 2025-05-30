package dsa_Problems.graph;

public class PrimsAlgo {
    class Pair{
        int node;
        int weight;
        Pair(int node,int weight){
            this.node = node;
            this.weight = weight;
        }
    }

    public ArrayList<Pair>[] createUndirectedGraph(int[][] edges, int nodes){

        //create Array of list
        @SuppressWarnings("unchecked")
        ArrayList<Pair>[] graph = (ArrayList<Pair>[]) new ArrayList[nodes+1];
        for (int i = 0; i <= nodes; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < edges.length; i++){
            //extract starting point
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            graph[v].add(new Pair(u,w));
            graph[u].add(new Pair(v,w));
        }
        
        return graph;
    }

    
    public int solve(int A, int[][] B) {

        //Check null
        if(A == 0 || B == null || B.length == 0){
            return -1;
        }

        //create a adjacency matrix
        ArrayList<Pair>[] graph = createUndirectedGraph(B, A);
        //create visitor Array
        boolean[] visitor = new boolean[A+1];
        //create priority queue
        PriorityQueue<Pair> queue = new PriorityQueue<>((p1,p2)->Integer.compare(p1.weight,p2.weight));
        //add the first Pair
        queue.add(new Pair(1,0));

        int cost = 0;

        while(!queue.isEmpty()){
            //remove the peek element
            Pair curr = queue.poll();
            int v = curr.node;
            int w = curr.weight;

            if(visitor[v]){
                continue;
            }
            else{
                visitor[v] = true;
                cost += w;
                //explore the neighbour
                for(Pair nbr : graph[v]){
                    if(!visitor[nbr.node]){
                        queue.add(new Pair(nbr.node, nbr.weight));
                    }
                }
            }

        }
        return cost;
    }
}
