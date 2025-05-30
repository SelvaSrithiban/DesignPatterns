package dynamicProgramming.knapsack;

public class RodCutting {

    public int solve(int[] A) {

        //check null
        if(A == null || A.length == 0){
            return -1;
        }

        int n = A.length;
        //create dp array
        int[] dp = new int[n+1];

        //Traverse through the array
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], A[j-1]+dp[i-j]);
            }
        }

        return dp[n];
    }

}
