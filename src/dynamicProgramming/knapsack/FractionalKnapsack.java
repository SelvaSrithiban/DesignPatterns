package dynamicProgramming.knapsack;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public class Pair{

        int value;
        int weight;

        Pair(int value, int weight){
            this.value = value;
            this.weight = weight;
        }

    }
    public int solve(int[] A, int[] B, int C) {

        //check null
        if(A == null || B == null || A.length == 0 || B.length == 0){
            return -1;
        }
        int n = A.length;
        int m = B.length;
        //if size of arrays are different
        if(A.length != B.length){
            return -1;
        }
        
        //create Pair array
        Pair[] P = new Pair[n];
        //Insert elements into Pair
        for(int i = 0; i < n; i++){
            P[i] = new Pair(A[i], B[i]);
        }
        //sort the array based on values/weights on descending order
        Arrays.sort(P, new Comparator<Pair>(){

            @Override
            public int compare(Pair p1, Pair p2){
                //calculate r1
                double r1 = ((double)p1.value/p1.weight) * 1.0;
                double r2 = ((double)p2.value/p2.weight) * 1.0;

                return Double.compare(r2, r1);
            }
        });
        double ans = 0.0;
        //Traverse through Pair array
        for(int i = 0; i < n; i++){
            if(P[i].weight <= C){
                ans += P[i].value;
                C -= P[i].weight;
            }else{
                ans += ((double)P[i].value / P[i].weight) * C;
                break;
            }
        }

       return (int)(ans*100);
    }

}
