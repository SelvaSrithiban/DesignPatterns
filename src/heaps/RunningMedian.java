package heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        //check null
        if(A == null || A.size() == 0){
            return ans;
        }
        int n = A.size();
        
        //Create max heap and min heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //Add the first element to maxHeap
        maxHeap.add(A.get(0));
        ans.add(A.get(0));

        //Traverse through rest of list 
        for(int i = 1; i < n; i++){
            //if current element is greater than maxHeap Peak
            if(A.get(i) > maxHeap.peek()){
                //insert it in minHeap
                minHeap.add(A.get(i));
            }else{
                maxHeap.add(A.get(i));
            }

            //Compute the difference of both the PriorityQueue
            int diff = Math.abs(minHeap.size() - maxHeap.size());
            //resize the heaps
            if(diff > 1){
                reSize(minHeap, maxHeap);
            }

            //if heap sizes are different
            if(maxHeap.size() > minHeap.size()){
                ans.add(maxHeap.peek());
            }else if(minHeap.size() > maxHeap.size()){
                ans.add(minHeap.peek());
            }else{ //if heap sizes are same
                ans.add(maxHeap.peek());
            }
        }
        return ans;
    }

    public void reSize(PriorityQueue<Integer> A, PriorityQueue<Integer> B){

        if(A.size() > B.size()){
            B.add(A.poll());
        }else{
            A.add(B.poll());
        }

    }

}
