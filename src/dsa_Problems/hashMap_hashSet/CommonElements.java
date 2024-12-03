package dsa_Problems.hashMap_hashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonElements {

     public int[] solve(int[] A, int[] B) {
       // HashMap to store frequency of elements in array A
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // Traverse through array A and store frequency of elements
        for (int a : A) {
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }

        // Traverse through array B to find common elements
        for (int b : B) {
            // Check if the element exists in HashMap and frequency is greater than 0
            if (hm.containsKey(b) && hm.get(b) > 0) {
                list.add(b);  // Add to the result list
                hm.put(b, hm.get(b) - 1);  // Decrease the frequency
            }
        }

        // Convert the result list to primitive int[] array
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);  // Unboxing Integer to int
        }

        return ans;
  }
    
    public static void main(String[] args) {
        
    }
}
