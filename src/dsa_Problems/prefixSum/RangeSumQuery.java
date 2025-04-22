package dsa_Problems.prefixSum;

import java.util.ArrayList;

public class RangeSumQuery {

    static int[] prefixSum(int[] a){
        int n = a.length;
        int[] ps = new int[n];
        ps[0] = a[0];
        for(int i = 1; i < n; i++){
            ps[i] = ps[i-1] + a[i];
        }
        return ps;
        //TC --> O(N)
    }

    static ArrayList<Long> prefixSum_1(ArrayList<Integer> A) {

        ArrayList<Long> ps = new ArrayList<>();

        ps.add(A.get(0).longValue());

        for(int i = 1; i < A.size(); i++){
            ps.add((ps.get(i-1) + A.get(i)));
        }

        return ps;
    }

    static ArrayList<Long> RangeSumQuery(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B){

        //check null
        if(A == null || A.isEmpty()){
            return null;
        }

        //create a output array
        ArrayList<Long> ans = new ArrayList<>(B.size());

        //Create a prefix sum array
        ArrayList<Long> ps = prefixSum_1(A);

        //Traverse through the Queries ArrayList
        for(int i = 0; i < B.size(); i++){

            int l = B.get(i).get(0);
            int r = B.get(i).get(1);

            //check if l is 0
            if(l == 0){
                ans.add(ps.get(r));
            }else{
                ans.add(ps.get(r)-ps.get(l-1));
            }
        }
        return ans;
    }

    static void optimizedQuery(int[] a, int[][] q){
        int[] ps = prefixSum(a);

        /*
        for (int i = 0; i < n; i++) {
            int ls = B[i][0];
            int rs = B[i][1];
            ans[i] = ps[rs] - (ls > 0 ? ps[ls - 1] : 0);   //using ternary operator
        }
        */
        for(int i = 0; i < q.length; i++){
            int l = q[i][0];
            int r = q[i][1];
            int sum = 0;
            if(l == 0){         //edge case to avoid index out of bounds
                sum = ps[r];
            }
            else{
                sum = ps[r] - ps[l-1];
            }
            System.out.println(sum);
        }
    //TC --> q+n --> O(q+n)
    //SC --> O(n)
    }

   static void brutForce(int[] a, int[][] q){
    for(int i = 0; i < q.length; i++){
        int l = q[i][0];
        int r = q[i][1];
        int sum = 0;
        for(int j = l; j <= r; j++){
            sum += a[j];
        }
        System.out.println(sum);
    }
    //TC --> O(q*n)
    //SC --> O(1)
   }

    public static void main(String[] args) {
        
        int[] a = {2,4,3,7,1,9};
        int[][] query = {{0,4},
                        {2,4},
                        {1,1}
                        };
        brutForce(a, query);
        System.out.println("*****************");
        optimizedQuery(a, query);
    }

}