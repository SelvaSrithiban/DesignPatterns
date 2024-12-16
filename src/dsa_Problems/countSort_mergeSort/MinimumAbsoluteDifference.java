package dsa_Problems.countSort_mergeSort;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

     public int solve(int[] A) {

        //edge case
        if(A == null){
            return -1;
        }

        Arrays.sort(A);

        int min = Integer.MAX_VALUE;

        for(int i = 1; i < A.length; i++){

            min = Math.min(min, A[i]- A[i-1]);
        }

        return min;
        
    }

}
