package dsa_Problems.iterations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class SeiveAlgorithm {

    public Hashtable<Integer, Boolean> generatePrime(int N){
    
        Hashtable<Integer, Boolean> primeTable = new Hashtable<>();
        for(int i = 1; i <= N; i++){
            primeTable.put(i, true);
        }
        primeTable.put(1, false);
       

        for(int i = 2; i*i <= N; i++){
            if(primeTable.get(i) == true){
                for(int j = i*i ; j <= N; j = i+j){
                    primeTable.put(j,false);
                }
            }
        }

        return primeTable;

    }

     public int[] solve(int A) {

        ArrayList<Integer> ans = new ArrayList<>();
        boolean arr[] = new boolean[A+1];
        Arrays.fill(arr, true);
        arr[0] = false; arr[1] = false;

        for(int i = 2; i*i <= A; i++){

            if(arr[i] == true){

                for(int j = i*i; j <= A; j = j+i){

                    arr[j] = false;
                }
            }
        }

        for(int k = 2; k <= A; k++){

            if(arr[k] == true){

                ans.add(k);
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }

    //TC: O(N * log(log N))
    //SC: O(N)
}
