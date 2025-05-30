package dynamicProgramming.knapsack;

import java.util.Arrays;

public class UnboundedKnapsack {

     public int solve(int A, int[] B, int[] C) {

        //create dp array
        int[] dp = new int[A+1];
        //Fill the array with 0
        Arrays.fill(dp, 0);

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < B.length; j++){
                if(C[j] <= i){
                    dp[i] = Math.max(dp[i], B[j] + dp[i - C[j]]);
                }
            }
        }

        return dp[A];

    }

}
