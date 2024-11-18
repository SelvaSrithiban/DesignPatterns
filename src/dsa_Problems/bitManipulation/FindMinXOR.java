package dsa_Problems.bitManipulation;

import java.util.Arrays;

    public class FindMinXOR {
        
        public int findMinXor(int[] A) {
    // sort the array A in ascending order
            int n = A.length;
            Arrays.sort(A);
            // the answer will be the min of XOR of each adjacent elements
            int ans = A[0] ^ A[1];
            for (int i = 2; i < n; i++) {
                ans = Math.min(A[i] ^ A[i - 1], ans);
            }
            return ans;
        }
}
