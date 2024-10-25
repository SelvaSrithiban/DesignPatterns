package twoDArrays;

public class PrintBoundaryElementof2DArray{

    public static void brutForce(int[][] A){
        System.out.println("Brut Force Output:");
        int row = A.length;
        int col = A[0].length;

        //print the first row
        for(int i = 0; i < row; i++){
            System.out.print(A[0][i] + " ");
        }

        //print the last column leaving the first and last element
        for(int j = 1; j < col-1; j++){
            System.out.print(A[j][col-1] + " ");
        }

        //print the last row in reverse order
        for(int k = col-1; k >= 0; k--){
            System.out.print(A[row-1][k] + " ");
        }

        //print the first column in reverse excluding the first and last element
        for(int l = row-2; l > 0; l--){
            System.out.print(A[l][0] + " ");
        }
        System.out.println();
        return;
    }
    //TC - O(n)
    //SC - O(1)

    public static void optimized1(int[][] A){
        System.out.println("Optimized Output:");

        int n = A.length;
        int r = 0;
        int c = 0;

        //print n-1 elements of oth row(Left to Right)
        for(int i = 1; i < n; i++){
            System.out.print(A[r][c] + " ");
            c++;
        }

        //print n-1 elements of last column(Top to Bottom)
        for(int i = 1; i < n; i++){
            System.out.print(A[r][c] + " ");
            r++;
        }


        //print n-1 elements of last row(Right to Left)
        for(int i = 1; i < n; i++){
            System.out.print(A[r][c] + " ");
            c--;
        }


        //print n-1 elements of first column(Bottom to Top)
        for(int i = 1; i < n; i++){
            System.out.print(A[r][c] + " ");
            r--;
        }

        return;
    }
    //TC - O(n)
    //SC - O(1)


    public static void main(String[] args) {

        int[][] A = {{1,2,3},
                      {4,5,6},
                    {7,8,9}};
        brutForce(A);
        optimized1(A);
        
    }
}