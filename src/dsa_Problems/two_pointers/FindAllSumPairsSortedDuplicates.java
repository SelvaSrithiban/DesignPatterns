package dsa_Problems.two_pointers;

import java.util.HashMap;

public class FindAllSumPairsSortedDuplicates {

    public static int solve(int[] A,int B){

        //check null
        if(A == null || A.length == 0){
            return -1;
        }
        int n = A.length;
       
        int count = 0;

        //Store the frequecy in Map
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : A){
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        //Create ditinct array
        int[] distinct = map.keySet().stream().mapToInt(Integer::intValue).toArray();
        int i = 0;
        int j = distinct.length - 1;

        while(i < j){
            //compute the sum
            int sum = distinct[i] + distinct[j];
            //if sum equals target
            if(sum == B){
                count += map.get(distinct[i]) * map.get(distinct[j]);
                i++;
                j--;
            }else if(sum < B){
                //move i pointer
                i++;
            }else{
                //sum is greater than B, move j pointer
                j--;
            }
        }
        return count;

        //TC: O(n)
        //SC: O(n+n)
    }


    /******************Without using Hashmap************/
    public static int solve1(int[] A,int B){

        //check null
        if(A == null || A.length == 0){
            return -1;
        }

        int n = A.length;
        int i = 0;
        int j = n-1;
        int count = 0;

        while(i < j){
            //Compute the sum
            int sum = A[i] + A[j];

            //if sum equals B
            if(sum == B){

                //if A[i] equals A[j]
                if(A[i] == A[j]){
                    if (A[i] == A[j]) {
                        int tmp = j - i + 1;
                        count += (tmp * (tmp - 1)) / 2; // nC2
                        break;
                    }
                }
                int frei = 1;
                int frej = 1;
                //check if i adjacent indexes are same
                while(i < j && A[i] == A[i+1]){
                    frei++;
                    i++;
                }
                //check if j adjacent indexes are same
                while(i < j && A[j] == A[j-1]){
                    frej++;
                    j--;
                }
                count += frei * frej;
                i++;
                j--;

            }else if(sum > B){  //move the j pointer
                j--;
            }else{  //move the i pointer
                i++;
            }
        }
        return count;
        //TC: O(n)
        //SC: O(n+n)
    }


    public static void main(String[] args) {
        
        int[] A = {2,3,3,10,10,10,15};
        int B = 13;

        System.out.println(solve(A, B));
    }

}
