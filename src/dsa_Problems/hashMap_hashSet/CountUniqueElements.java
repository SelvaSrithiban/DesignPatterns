package dsa_Problems.hashMap_hashSet;

import java.util.HashMap;

public class CountUniqueElements {

    public int solve(int[] A) {

        int count = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int a : A){
            if(freq.containsKey(a)){
                freq.put(a, freq.getOrDefault(a, 0) + 1);
            }else{
                freq.put(a, 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> fq : freq.entrySet()) {
            // Check if the frequency is 1
            if (fq.getValue() == 1) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        
    }
}
