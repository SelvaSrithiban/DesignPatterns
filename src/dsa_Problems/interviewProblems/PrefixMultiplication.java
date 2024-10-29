package dsa_Problems.interviewProblems;

public class PrefixMultiplication {

    public static int[] solve(int[] A){
        int n = A.length;
        int[] pm = new int[n];
        pm[0] = A[0];

        for(int i = 1; i < n; i++){
            pm[i] = pm[i-1]*A[i];
        }

        /*for(int i = 0; i < n; i++){
            System.out.print(pm[i] + " ");
        }*/
        
        return pm;
    }

    public static void main(String[] args) {

        int[] A = {1,2,3,4,5};
        solve(A);

        
    }
    
}
