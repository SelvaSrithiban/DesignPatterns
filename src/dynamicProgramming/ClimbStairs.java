package dynamicProgramming;

import java.util.Arrays;

public class ClimbStairs {

    static final int MOD = 1_000_000_007;
    public int rec(int A, int[] dp){

        //base case
        if(A == 0 || A == 1){
            return 1;
        }

        //check dp
        if(dp[A] != -1){
            return dp[A];
        }

        dp[A] = (int)(((long)rec(A - 1, dp) + rec(A - 2, dp)) % MOD);

        return dp[A];

    }
    public int climbStairs(int A) {

        //check null
        if(A < 0){
            return -1;
        }

        //create dp array
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        int ans = rec(A, dp);
        
        return ans;
    }

}
