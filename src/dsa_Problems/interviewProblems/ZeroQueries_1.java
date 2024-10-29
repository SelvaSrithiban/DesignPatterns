package dsa_Problems.interviewProblems;

public class ZeroQueries_1 {

    static int[] brutForce(int[] A, int[][] Q){
        int n = A.length;
        int m = Q.length;
        //System.out.println(m);
    
        for(int i = 0; i < m; i++){
            int s = Q[i][0];
            int e = Q[i][1];
            int v = Q[i][2];
            System.out.println("s: " + s + "e: " + e + " v: " + v);
            for(int j = s; j <= e; j++){
                A[j] += v;
            }
        }
        return A;
        }
        //TC : O(m*n)
        //SC : O(1)

        static int[] prefixSum(int[] A){
            int n = A.length;
    
            for(int i = 1; i < n; i++){
                A[i] = A[i-1] + A[i];
            }
            return A;
    
        }

        static int[] optimized(int[] A, int[][] Q){
            int m = Q.length;
            int n = A.length;
    
            for(int i = 0; i < m; i++){
                int s = Q[i][0];
                int e = Q[i][1];
                int v = Q[i][2];
                A[s] += v;
                if(e < n-1){
                A[e+1] += -(v);
                }
            }
    
            prefixSum(A);
            
            return A;
        }
        //TC : O(m)
        //SC : O(1)
    
    public static void main(String[] args) {

        int[] A = {0,0,0,0,0,0};
        int[][] Q = {{1,3,2},{2,5,2},{3,5,3}};
        //brutForce(A,Q);
        optimized(A, Q);
        for(int i  = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        
    }
}
