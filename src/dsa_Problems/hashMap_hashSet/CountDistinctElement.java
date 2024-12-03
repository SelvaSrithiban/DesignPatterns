package dsa_Problems.hashMap_hashSet;

import java.util.HashSet;

public class CountDistinctElement {

    public int solve(int[] A) {

        HashSet<Integer>  hs = new HashSet<>();
        for(int i = 0; i < A.length ; i++){

            hs.add(A[i]);
        }
        return hs.size();

    }
    
    public static void main(String[] args) {
        
    }
}
