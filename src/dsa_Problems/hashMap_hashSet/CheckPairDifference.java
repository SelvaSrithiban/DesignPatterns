package dsa_Problems.hashMap_hashSet;

import java.util.HashSet;

public class CheckPairDifference {

    static boolean checkPairDiff(int[] A, int B){

        //Check for the edge case
        if(A == null || A.length == 1){
            return false;
        }

        int n = A.length;
        HashSet<Integer> set = new HashSet<>();

        //Traverse through the array and fill the hashset
        for(int a : A){
            set.add(a);
        }

        //Traverse through the array and check target value
        for(int num : A){
            int target = num - B;
            if(set.contains(target)){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        
        int[] A = {3,5,1,2};
        int B = 4;

        System.out.println(checkPairDiff(A, B));
    }

}
