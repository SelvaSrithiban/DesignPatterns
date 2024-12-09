package dsa_Problems.hashMap_hashSet;

import java.util.HashMap;

public class CheckPairDifference {
    
     public int solve(int[] A, int B) {

        int n = A.length;
        final int mod = 1000000007;
        int count = 0;

        //if the array is null or Size is 1
        if(A == null || n == 1){
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        //Traverse through the array
        for(int i = 0; i < n; i++){
           count = (count + map.getOrDefault(A[i]+B, 0) + map.getOrDefault(A[i] - B, 0)) % mod;
           
           //Increase the value of key already present if not 0
           map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        return count % mod;
    }

    //TC : O(n)
    //SC : O(n)
}
