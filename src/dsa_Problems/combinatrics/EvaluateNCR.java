package dsa_Problems.combinatrics;

public class EvaluateNCR {

    public static int[][] ncrMat(int n, int r, int m){

        int ans[][] = new int[n+1][r+1];
        ans[0][0] = 1;
        for(int i = 1; i <= n; i++){

            for(int j = 0; j <= Math.min(n,r); j++){

                if(j == 0 || j == i){
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = (ans[i-1][j-1] + ans[i-1][j]) % m;
                }
            }
        }
        return ans;
    }    

    public static int solve(int A, int B, int C) {

        int arr[][] = ncrMat(A,B,C);
        return arr[A][B] % C;
    }
    
    public static void main(String[] args) {
        
    }
}
