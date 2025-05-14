package heaps;

import java.util.PriorityQueue;

public class AthLargestElementInFixedSubarray {

    public int[] solve(int A, int[] B) {

        //check null
        if(B == null || B.length == 0){
            return new int[0];
        }

        int n = B.length;
        int[] ans = new int[n];

        //insert negative for values for A-2
        for(int i = 0; i <= A-2; i++){
            ans[i] = -1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //add the first A element to queue 
        for(int i = 0; i < A; i++){
            pq.add(B[i]);
        }
        //add the peek element to A-1th element
        ans[A-1] = pq.peek();

        //Traverse through rest of the subarrays
        for(int i = A; i < n; i++){
            int top = pq.peek();
            //check if the current element is greater than peek
            if(B[i] > top){
                //pop the first element
                pq.poll();
                //insert the current element to queue
                pq.add(B[i]);
                //add the peek element to ans array
                ans[i] = pq.peek();
            }else{
                ans[i] = pq.peek();
            }
        }

        return ans;
    }

}
