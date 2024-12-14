package dsa_Problems.hashMap_hashSet;

import java.util.HashMap;

public class SubarraySumEqualsK {
    
     public int solve(int[] A, int B) {

        int n = A.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        
        //Cover the edge cases
        if(A == null){
            return count;
        }

        if(n == 1){
            if(A[0] == B){
                count++;
                return count;
            }
        }

        //Insert the 0 into HashMap
        map.put(0, 1);

        //Traverse through the array
        for(int i = 0; i < n; i++){
            sum += A[i];
            //Calculate the target
            int target = sum - B;

            if(map.containsKey(target)){
                count += map.get(target);
            }

            //insert the prefix sum into HashMap
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            }else{
                map.put(sum, 1);
            }
        }
        return count;
    }
}
