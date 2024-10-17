package dsa_Problems.subArrays;

public class PrintSubArrays {

    static void brutForce(int[] A){
        int n = A.length;

        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                for(int i = s; i <= e; i++){
                    System.out.print(A[i] + " ");
                }
                System.out.println();
            }
        }
        return;
    }
    //TC: O(N^3)
    //SC: O(1)


    public static void main(String[] args) {

        int[] A = {5,9,2};      
        brutForce(A);  
    }
    
}
