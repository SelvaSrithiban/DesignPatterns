package dsa_Problems.combinatrics;

public class PascalTriangle {

    public int[][] solve(int N) {

        if(N == 0){
            int ans[][] = new int[N][N];
            //ans[0][0] = 0;
            return ans;
        }else{

        int ans[][] = new int[N][N];
        ans[0][0] = 1;
        for(int i = 1; i < N; i++){

            for(int j = 0; j <= i; j++){

                if(j == 0 || j == i){
                   ans[i][j] = 1;
                }else{
                     ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
                }
            }
        }
        return ans;
        }
    } 
    
    public static void main(String[] args) {
        
    }
}
