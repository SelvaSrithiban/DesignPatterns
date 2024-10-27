package twoDArrays;

import java.nio.channels.Pipe.SourceChannel;

public class FindSumOfSubMatrices {

    public static int optimized(int[][] A){
        int n = A.length;
        int m = A[0].length;
        int ans = 0;

        for(int  i = 0; i < n; i++){
            for(int j = 0; j < m;j++ ){
                int count = ((i + 1) * (j + 1)) * ((n-i)* (m - j));
                ans += count*A[i][j];
            }
        }
        return ans;
    }
    //TC : O(n^2)
    //SC : O(1)

    public static void main(String[] args) {

        int[][] A = {{1,2,3},
                      {4,5,6},
                    {7,8,9}};
        System.out.println(optimized(A));
        
    }
    
}
