package dsa_Problems.interviewProblems;

public class ProductArrayPuzzle {

    public static int[] solve(int[] A){
        int n = A.length;
        int[] ans = new int[n];

        int[] pm = PrefixMultiplication.solve(A);
        int[] sm = SuffixMultiplication.solve(A);

        ans[0] = sm[1];
        ans[n-1] = pm[n-2];

        for(int i = 1; i < n-1; i++){
            ans[i] = pm[i-1]*sm[i+1];
        }

        for(int j = 0; j < n; j++){
            System.out.print(ans[j] + " ");
        }

        return ans;
    }
    //TC : O(n)
    //SC : O(n)

    public static void main(String[] args) {

        int[] A = {1,2,3,4,5};
        solve(A);
        
    }
    
}
