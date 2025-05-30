package dynamicProgramming.knapsack;

public class KnapSack01 {

    public int tabu(int[] A, int[] B, int C) {

        int len = A.length;
        //create dp array
        int[][] dp = new int[len+1][C+1];
        int n = dp.length;
        int m = dp[0].length;

        //traverse through the array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                //fill the first row and column with 0
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else{
                    //value if current element is not picked
                    int reject = dp[i-1][j];
                    int select = 0;
                    if(j >= B[i-1]){
                        select = A[i-1] + dp[i-1][j - B[i-1]];
                    }
                    dp[i][j] = Math.max(reject, select);
                }
            }
        }

        return dp[n-1][m-1];
    }

}
