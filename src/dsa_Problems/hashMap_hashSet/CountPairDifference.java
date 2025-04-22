package dsa_Problems.hashMap_hashSet;

import java.util.HashMap;

public class CountPairDifference {
    
     public int solve(int[] A, int B) {

         //check for the edge case
         if(A == null || A.length == 1){
            return -1;
        }

        final int mod = 1000000007;
        int n = A.length;
        int count = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();

        //Traverse through the array and update the frequency in map
        for(int a : A){
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }

        //Compute the target value and check if exists in the map
        for(int a : A){
            //Compute the target value
            int target = a - B;
            count = (count + freq.getOrDefault(target, 0)) % mod;
        }

        return count;
    }

    //TC : O(n)
    //SC : O(n)
}
