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
    
    public static void main(String[] args) {
        
    }
}
