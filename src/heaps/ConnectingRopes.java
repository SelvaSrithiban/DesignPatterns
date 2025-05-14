package heaps;

import java.util.PriorityQueue;

public class ConnectingRopes {

    public int connectingRopes(int[] A){

        //check null
        if(A == null || A.length == 0){
            return -1;
        }

        int n = A.length;
        if(n == 1){
            return 0;
        }
        int sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //add elemenets to queue
        for(int rope : A){
            pq.add(rope);
        }

        while(pq.size() > 1){
            //extract first two elements
            int val1 = pq.poll();
            int val2 = pq.poll();

            //update the sum
            sum = sum + val1 + val2;
            //add the current sum to queue
            pq.add(val1 + val2);
        }

        return sum;
    }
}
