package dynamicProgramming;

public class UniquePathsWithObstacles {

    public static int memo(int[][] A, int n, int m, int[][] dp) {
        // base case

        if (n < 0 || m < 0 || A[n][m] == 1) { //check if obstacle exists
            return 0;
        }
        if (n == 0 && m == 0) {
            return 1;
        }
    
        // check dp AFTER bounds check
        if (dp[n][m] != 0) {
            return dp[n][m];
        }
    
        // recursive calls
        int way1 = memo(A, n - 1, m, dp);
        int way2 = memo(A, n, m - 1, dp);
    
        dp[n][m] = way1 + way2;
    
        return dp[n][m];
    }

    public static int tabu(int[][] A) {
        
        int n = A.length;
        int m = A[0].length;
        //create dp array
        int[][] dp = new int[n][m];
          // If the start is an obstacle, there are 0 paths
        if (A[0][0] == 1) {
            return 0;
        }

        // Initialize the starting point
        dp[0][0] = 1;

        // Fill the first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = (A[i][0] == 1) ? 0 : dp[i - 1][0];
        }

        for (int i = 1; i < n; i++) {
           if(A[i][0] == 1){
                dp[i][0] = 0;
           }else{
                dp[i][0] = dp[i-1][0];
           }
        }

        // Fill the first row
        for (int j = 1; j < m; j++) {
            dp[0][j] = (A[0][j] == 1) ? 0 : dp[0][j - 1];
        }

        //traverse through the array
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if (A[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[n-1][m-1];
    }

    public int uniquePathsWithObstacles(int[][] A) {

        
        int n = A.length;
        int m = A[0].length;
        int[][] dp = new int[n][m];
        //top-bottom approach call
        int ans = memo(A, n-1, m-1, dp);

        return ans;
    }

}
