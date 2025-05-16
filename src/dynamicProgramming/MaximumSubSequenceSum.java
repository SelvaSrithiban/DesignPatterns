package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubSequenceSum {

    public static int topBottom(ArrayList<Integer> A, int start, int end, int[] dp){

        //base case
        if(start >= end){
            return 0;
        }

        //check dp
        if(dp[start] != Integer.MIN_VALUE){
            return dp[start];
        }

        //picked
        int pick = A.get(start) + topBottom(A, start + 2, end, dp);
        //Not picked
        int npick = topBottom(A, start+1, end, dp) + 0;

        //update dp 
        dp[start] = Math.max(pick, npick);
        return dp[start];

    }

    public static int bottomTop(ArrayList<Integer> A){

        int n = A.size();
        //create dp array for tabulation
        int[] dp = new int[n+2];
        //fill with -ve max 
        Arrays.fill(dp, 0);

        int ans = Integer.MIN_VALUE;

        for(int i = n-1; i >= 0; i--){

            //picked
            int pick = A.get(i) + dp[i+2];
            //Not picked
            int nPick = 0 + dp[i+1];

            dp[i] = Math.max(pick, nPick);

        }

        //return the oth element
        return dp[0];
    }

    public static int rec(ArrayList<Integer> A, int start, int end){

        //base case
        if(start >= end){
            return 0;
        }

        //picked
        int pick = A.get(start) + rec(A, start + 2, end);
        //Not picked
        int npick = rec(A, start+1, end) + 0;

        return Math.max(pick, npick);

    }
    public static int maxSubsequenceSum(ArrayList<Integer> A) {

        //check null
        if(A == null || A.size() == 0){
            return -1;
        }
                        
        int n = A.size();

        //make a recursive call
        int ans = rec(A, 0, n);
        System.out.println("For recursive call " + ans);
        //create dp array for memoization
        int[] dp = new int[n];
        //fill with -ve max 
        Arrays.fill(dp, Integer.MIN_VALUE);
        
        //make a memoization call
        int ans1 = topBottom(A, 0, n, dp);
        System.out.println("For Top-Bottom Approach " + ans1);

        //make a tabulation call
        int ans2 = bottomTop(A);
        System.out.println("For Bottom-Top Approach " + ans2);


        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(9);
        A.add(4);
        A.add(13);
        A.add(24);
        
        maxSubsequenceSum(A);
    }

}
