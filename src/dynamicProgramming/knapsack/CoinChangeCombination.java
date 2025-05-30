package dynamicProgramming.knapsack;

public class CoinChangeCombination {

    // Modulus to prevent integer overflow and match expected output format
    final int mod = 1000007;

    public int coinchange2(int[] A, int B) {
        // Edge case: if the coin array is null or empty, return -1
        if (A == null || A.length == 0) {
            return -1;
        }

        // Initialize the DP array where dp[i] represents the number of ways to make amount 'i'
        int[] dp = new int[B + 1];

        // There's exactly one way to make amount 0 — by choosing no coins
        dp[0] = 1;

        // Iterate over each coin denomination
        for (int coin : A) {
            // For each amount from the coin value up to the target amount B
            for (int j = coin; j <= B; j++) {
                // Update the number of ways to make amount 'j' by including this coin
                // Use modulo to avoid overflow and conform to problem constraints
                dp[j] = (dp[j] + dp[j - coin]) % mod;
            }
        }

        // The result is the number of ways to form amount B
        return dp[B];
    }

}
