package twoDArrays;

public class GenerateSquareMatrixFromN {

    public int[][] generateMatrix(int A){
         //create a matrix with the given input
         int ans[][] = new int[A][A];

         int n = A;
         int row = 0;
         int col = 0;
         int B = 1;
 
         while(n > 1){
 
             for(int i = 1; i < n; i++){
                 ans[row][col] = B;
                 B++;
                 col++;
             }
 
             for(int i = 1; i < n; i++){
                 ans[row][col] = B;
                 B++;
                 row++;
             }
 
             for(int i = 1; i < n; i++){
                 ans[row][col] = B;
                 B++;
                 col--;
             }
 
             for(int i = 1; i < n; i++){
                 ans[row][col] = B;
                 B++;
                 row--;
             }
 
             row++;
             col++;
             n = n-2;
         }
 
         if(n == 1){
             ans[row][col] = B;
         }
 
 
         return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
