package queues;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumbers {

     public String solve(int A) {

        //check if 0 or negative
        if(A <= 0){
            return null;
        }

        if(A == 1 || A == 2){
            return String.valueOf(A);
        }

        Queue<String> q = new LinkedList<>();
        //add first two elements to Queue
        q.add("1");
        q.add("2");

        int i = 3;
        while(i <= A){
            //Dequeue the first element
            int x = Integer.valueOf(q.remove());

            int first = x * 10 + 1;
            int second = x * 10 + 2;

            if(i == A){
                return String.valueOf(first);
            }else if(i+1 == A){
                return String.valueOf(second);
            }

            //enque the elements
            q.add(String.valueOf(first));
            q.add(String.valueOf(second));

            i = i+2;
        
        }
        
        return null;
    }

}
