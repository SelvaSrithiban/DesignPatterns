package dsa_Problems.hashMap_hashSet;

import java.util.HashMap;

public class DistinctNumbersInwindow {
    
    public int[] dNums(int[] A, int B) {
         
        int n = A.length;
        //Check if B > n 
        if(B > n){
            return new int[0];
        }

        int[] ans = new int[n-B+1];

        HashMap<Integer, Integer> map = new HashMap<>();

        //Traverse through the first window
        for(int i = 0; i < B; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }else{
                map.put(A[i], 1);
            }
        }
        ans[0] = map.size();

        //Slide through the rest of the windows

        int s = 1;
        int e = B;
        while(e < n){

            //remove the first element from the window
            if(map.getOrDefault(A[s-1], 0) > 1){
                map.put(A[s-1], map.get(A[s-1]) - 1);
            }else{
                map.remove(A[s-1]);
            }

            //Add new element to the window
            if(map.containsKey(A[e])){
                map.put(A[e], map.get(A[e]) + 1);
            }else{
                map.put(A[e], 1);
            }

            ans[s] = map.size();
            s++;
            e++;
        }
     return ans;
    }

    //TC: O(n)
    //SC : O(n)
}
