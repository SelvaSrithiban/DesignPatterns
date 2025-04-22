package dsa_Problems.hashMap_hashSet;

import java.util.HashSet;

public class FirstRepeatingElement {

    public int solve(int[] A) {
        //If array is empty
        if (A.length == 0) {
            return -1;
        }

        HashSet<Integer> hs = new HashSet<>();
        int ans = -1;

        //Traverse from right to left in array
        for(int i = A.length-1; i >= 0; i--){

            if(hs.contains(A[i])){
                ans = A[i];
            }else{
                hs.add(A[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
    }
    
}
