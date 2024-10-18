package dsa_Problems.subArrays;

import java.util.Scanner;

public class SubArraysTo2DArray {

    static int[][] brutForce(int[] A){
        int n = A.length;
        int m = n*(n+1)/2;
        int[][] ans = new int[m][];
        int temp = 0;

        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                ans[temp] = new int[e-s+1];
                for(int i = s; i <= e; i++){
                    ans[temp][i-s] = A[i];
                }
                temp++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[][] ans = brutForce(A);
        int n = ans.length;
        for(int i = 0; i < n; i++){
            int m = ans[i].length;
            for(int j = 0; j < m ; j++){
                System.out.print(ans[i][j] + " ");
            }  
            System.out.println();
        }
    }
    
}
