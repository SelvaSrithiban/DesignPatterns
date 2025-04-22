package dsa_Problems.sortingAlgorithms;

public class MaxChunksToMakeArraySorted {

    public int solve(int[] A) {

        //if A is null
        if(A == null){
            return -1;
        }
        int count = 0;
        int n = A.length;
        //if size is 1
        if(n == 1 || n == 2){
            return 1;
        }
        int max = Integer.MIN_VALUE;

        //Travese through the array
        for(int i = 0; i < n; i++){
            //check if ith element is equal to max then increment the count
            max = Math.max(max, A[i]);
            if(i == max){
                count++;
            }
        }

        return count;
    }

    //TC : O(n)
    //SC: O(1)
    
}
