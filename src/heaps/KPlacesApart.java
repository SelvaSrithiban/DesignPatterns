package heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KPlacesApart {

    public ArrayList<Integer> kPlacesApart(int[] A, int k){

        if (A == null || A.length == 0) {
            return new ArrayList<>();
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(a, b));
        int n = A.length;
        //Add k+1 elements to the queue
        for(int i = 0; i <= Math.min(k, n-1); i++){
            pq.add(A[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        //add the first element to ans
        ans.add(pq.poll());

        //Traverse through the arrat
        for(int i = k+1; i< n; i++){
            //add the current element to queue
            pq.add(A[i]);
            //Add the peek element to ans
            ans.add(pq.poll());
        }

        //add the remaining element in queue
        while(pq.size()> 0){
            ans.add(pq.poll());
        }

        return ans;
    } 

}
