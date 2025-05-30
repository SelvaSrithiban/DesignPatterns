package dynamicProgramming.knapsack;

public class KnapSack012 {
    public int solve(int[] A, int[] B, int C) {
        int n = A.length;
       int mxval = 50 * n;
       int[] dp = new int[mxval + 1];
       for (int i = 0; i < mxval + 1; i++) {
           dp[i] = 1000000000;
       }
       dp[0] = 0;
       for (int i = 0; i < n; i++) {
           for (int val = mxval; val >= A[i]; val--) {
               dp[val] = Math.min(dp[val], B[i] + dp[val - A[i]]);
           }
       }
       int ans = 0;
       for (int val = mxval; val >= 0; val--) {
           if (dp[val] <= C) {
               ans = val;
               break;
           }
       }
       return ans;
   }
}
