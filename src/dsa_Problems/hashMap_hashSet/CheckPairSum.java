package dsa_Problems.hashMap_hashSet;

import java.util.HashSet;

public class CheckPairSum {

    public static int optimized(int A, int[] B){
        
        //if the array is null
        if(B == null){
            return 0;
        }
        int n = B.length;
        int k = A;
        //if the size is 1
        if(n == 1){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        //Traverse through the array
        for(int i = 0; i < n; i++){
            int target = k - B[i];
            if(set.contains(target)){
                return 1;
            }else{
                set.add(B[i]);
            }

        }
       return 0;
    }
    
    public static void main(String[] args) {
        
    }
}
