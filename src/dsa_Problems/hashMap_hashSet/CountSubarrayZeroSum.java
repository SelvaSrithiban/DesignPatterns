package dsa_Problems.hashMap_hashSet;

import java.util.HashMap;

public class CountSubarrayZeroSum {
    
     public int solve(int[] A) {
        final int MOD = 1000000007;
        int count = 0;
        long prefixSum = 0;
        
        // HashMap to store the frequency of prefix sums
        HashMap<Long, Long> prefixSumFrequency = new HashMap<>();
        
        // Initially, prefix sum 0 has been seen once (i.e., before the array starts)
        prefixSumFrequency.put(0L, 1L);

        // Traverse the array
        for (int i = 0; i < A.length; i++) {
            // Update the current prefix sum
            prefixSum += A[i];
            
            // If this prefix sum has been seen before, it means there are subarrays 
            // that sum to zero between previous occurrences and the current index
            count += prefixSumFrequency.getOrDefault(prefixSum, 0L);
            
            // Update the frequency of the current prefix sum
            prefixSumFrequency.put(prefixSum, prefixSumFrequency.getOrDefault(prefixSum, 0L) + 1);
        }

        // Return the count modulo 10^9 + 7
        return (int) (count % MOD);
    }


    public static int solve1(int[] A) {
        //check for the edge case
        if(A == null || A.length == 0){
            return -1;
        }

        int n = A.length;
        HashMap<Long,Long> psFrequency = new HashMap<>();
        final int mod = 1000000007;
        //Cover the edge case
        psFrequency.put(0l,1l);
        long count = 0;
        long pSum = 0;

        //Traverse through the array
        for(int i = 0; i < n; i++){

            //calculate prefix Sum
            pSum += A[i];
            System.out.println("pSum : " + pSum);
            //check if the pSum already exists and update count
            if(psFrequency.containsKey(pSum)){
                count += psFrequency.getOrDefault(pSum, 0l);
            }
            System.out.println("count : " + count);

            //Update the HashMap
            psFrequency.put(pSum, psFrequency.getOrDefault(pSum ,0l) + 1);
        }

        return (int)(count % mod);
    }
    
    public static void main(String[] args) {

        int[] A = {-1,8,-4,7,-4,0,-8,-2,-7};
        int[] B = {30,-30,30,-30};
        System.out.println(solve1(B));

        
    }
}
