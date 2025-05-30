package dsa_Problems.graph;

public class DjikstrasAlgo {
    class Pair{
        int node;
        int weight;
        Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }
    public ArrayList<Pair>[] createUndirectedGraph(int[][] edges, int A){

        //create Array of list
        @SuppressWarnings("unchecked")
        ArrayList<Pair>[] graph = (ArrayList<Pair>[]) new ArrayList[A+1];
        for (int i = 0; i < A; i++) {
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
    public int[] solve(int A, int[][] B, int C) {

        //create undirected graph
        ArrayList<Pair>[] graph = createUndirectedGraph(B, A);
        //create distance Array fill it with Max Value
        int[] distance = new int[A];
        Arrays.fill(distance, Integer.MAX_VALUE);
        //create priority queue
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2)->Integer.compare(p1.weight,p2.weight));
        //add the src nodes
        pq.add(new Pair(C, 0));

        //Traverse until queue is not empty
        while(!pq.isEmpty()){
            //remove the peek element 
            Pair curr = pq.poll();
            int node = curr.node;
            int weight = curr.weight;

            if(distance[node]!=Integer.MAX_VALUE){
                continue;
            }else{
                distance[node] = weight;
                //explore neighbour
                for(Pair nbr : graph[node]){
                    if(distance[nbr.node] == Integer.MAX_VALUE){
                        pq.add(new Pair(nbr.node, nbr.weight+weight));
                    }
                }
            }
        }
        for (int i = 0; i < A; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
            distance[i] = -1;
            }
         }
    
        return distance;
    }
}
