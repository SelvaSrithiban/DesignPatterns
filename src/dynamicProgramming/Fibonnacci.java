package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonnacci {

    public static int fibonnaci2(int n){
        //System.out.println("Inside the function " + n);
        //create dp array
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            //System.out.println("dp[i] for " + i + " is " + dp[i]);
        }
      
        return dp[n];
    }


    public static int fibonnaci(int n, int[] dp){

        //base case
        if(n <= 1){
            return n;
        }

        //before making recursive call check dp
        if(dp[n] != -1){
            return dp[n];
        }
        //make recursive call
        dp[n] = fibonnaci(n-1, dp) + fibonnaci(n-2, dp);
        return dp[n];

    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //Top Bottom / memoization
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = fibonnaci(n, dp);
        System.out.println("TB " + ans);

        //Bottom top/ tabulation
        int ans1 = fibonnaci2(n);
        System.out.println("BT " + ans1);
    }
}
