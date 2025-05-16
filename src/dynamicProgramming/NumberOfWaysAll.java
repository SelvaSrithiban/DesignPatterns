package dynamicProgramming;

import java.util.Arrays;

public class NumberOfWaysAll {

    public static int rec(int[][] A, int n, int m){

        //base case
        if(n == 0 && m == 0){
            return 1;
        }
        if(n < 0 || m < 0){
            return 0;
        }

        //call to n-1
        int way1 = rec(A, n-1, m);
        //cal to m-1
        int way2 = rec(A, n, m-1);

        return way1 + way2;
    }

    public static int memo(int[][] A, int n, int m, int[][] dp) {
        // base case
        if (n < 0 || m < 0) {
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
        //fill the first row and first colum with 1
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            dp[0][j] = 1;
        }

        //traverse through the array
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[n-1][m-1];

    }

    public static void main(String[] args) {
        
        int[][] A = new int[2][3];

        int n = A.length;
        int m = A[0].length;
        //recursion call
        int ans = rec(A, n-1, m-1);
        System.out.println("Recursion: " + ans);

        //memoization
        //create dp array
        int[][] dp = new int[n][m];
        //top-bottom approach call
        int ans1 = memo(A, n-1, m-1, dp);
        System.out.println("Memoization: " + ans1);

        //tabulation
        int ans2 = tabu(A);
        System.out.println("Tabulation: " + ans2);


    }

}
