package twoDArrays;

import java.util.Collection;

public class PrintSpiralFormOf2DArray {

    public static void printSpiralForm(int[][] A){

        int n = A.length;
        int r = 0;
        int c = 0;

        while(n > 1){

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

            r++;
            c++;
            n -= 2;

        }

        //Cover the edge when n is odd, print the last element
        if(n == 1){
            System.out.print(A[r][c] + " ");
        }
        return;

    }
    //TC - O(n^2)
    //SC - O(1)

    Collection
    
    public static void main(String[] args) {
        int[][] A = {{1,2,3},
                      {4,5,6},
                    {7,8,9}};

        printSpiralForm(A);
    }
}
