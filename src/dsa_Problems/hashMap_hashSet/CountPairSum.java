package dsa_Problems.hashMap_hashSet;

import java.util.HashMap;

public class CountPairSum {
    
     public int solve(int[] A, int B) {
        final int mod = 1000000007;
        int n = A.length;
        int count = 0;
        //if array is null
        if(A == null){
            return count;
        }

        //if size of array is 1
        if(n == 1){
            return count;
        }

        //Traverse through the array
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int target = B - A[i];

            if(map.containsKey(target)){
                count += map.get(target) % mod;
            }

             // Update the frequency of the current number
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        return count % mod;
    }
}
