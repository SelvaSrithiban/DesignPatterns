package dynamicProgramming;

import java.util.Arrays;

public class MinimumNumberOfSquares {

    public int rec(int A, int[] dp){
        
        //base case
        if(A == 0){
            return 0;
        }

        //check dp array
        if(dp[A] != -1){
            return dp[A];
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 1; i * i <= A; i++){
            ans = Math.min(ans, rec(A - (i*i), dp));
        }

        dp[A] = ans+1;

        return dp[A];

    }

    public int tab(int A){
        int[] dp = new int[A+1];
        dp[0] = 0;
        dp[1] =1;
        for(int i = 2; i <= A; i++){
            int ans = Integer.MIN_VALUE;
            for(int x = i; x * x <= i; x++){
                ans = Math.min(ans, dp[i-(x*x)]);
            }
            dp[i] = ans + 1;
        }
        return dp[A];
    }
    public int countMinSquares(int A) {

        //edge case 
        if(A < 0){
            return -1;
        }
        //memoization approach
        //create dp array 
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        //make recursive call
        int ans = rec(A, dp);

        //tabulation approach
        

        return ans;
    }

}
