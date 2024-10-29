package dsa_Problems.interviewProblems;

public class SuffixMax {

    public static int[] solve(int[] A){
        int n = A.length;
        int[] sm = new int[n];

        sm[n-1] = A[n-1];

        for(int i = n-2; i >= 0; i--){
            sm[i] = Math.max(sm[i+1], A[i]);
        }

        for(int i = 0;i < n; i++){
            System.out.print(sm[i] + " ");
        }

        return sm;
    }
    public static void main(String[] args) {
        int[] A = {3,-2,6,2,8};
        solve(A);
    }
    
}
