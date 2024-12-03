package dsa_Problems.hashMap_hashSet;

import java.util.HashSet;

public class SubarrayWithZeroSum {

    public int solve(int[] A) {
      // Just write your code below to complete the function. Required input is available to you as the function arguments.
      // Do not print the result or any output. Just return the result via this function.
      long ps[] = new long[A.length];
      ps[0] = A[0];
      for(int i = 1 ; i < A.length; i++){
          ps[i] = ps[i-1]+ A[i];
      }

      HashSet<Long> hs = new HashSet<Long>();
      
      int t = 0;
      hs.add(Long.valueOf(t));

      for(int i = 0; i < ps.length; i++){

          if(hs.contains(ps[i])){
              return 1;
          }else{
              hs.add((Long)ps[i]);
          }
      }

      return 0;
  }
    
    public static void main(String[] args) {
        
    }
}
