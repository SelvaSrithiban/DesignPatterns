package dsa_Problems.prefixSum;

public class Client {

    public static int[] prefixSum(int[] A){
        int n = A.length;
        int ps[] = new int[n];
        ps[0] = A[0];
        for(int i = 1; i < n; i++){
            ps[i] = ps[i-1] + A[i];
        }
        return ps;
    }  

    static int[] prefixSumEven(int[] a){
        int n = a.length;
        int[] ps = new int[n];
        ps[0] = a[0];
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
            ps[i] = ps[i-1] + a[i];
            }else{
            ps[i] = ps[i-1];
            }
        }
        return ps;
        //TC --> O(n)
    }

    public static void main(String[] args) {
        
        int[] A = {1,2,3,7,1,2,3};
        int[] ps1 = prefixSum(A);
        int[] B = {1,2,3,4,5};
        int[] ps = prefixSumEven(B);
        for(int i = 0; i < ps.length; i++){
            System.out.println(ps[i]);
        }
    }
    
}
