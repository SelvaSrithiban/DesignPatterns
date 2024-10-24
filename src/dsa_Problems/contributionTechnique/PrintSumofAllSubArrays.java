package dsa_Problems.contributionTechnique;

public class PrintSumofAllSubArrays {

    static int optimized1(int[] A){
        System.out.println("Optimized-1 output");
        int n = A.length;
        int total = 0;

        for(int s = 0; s < n; s++){
            int sum = 0;
            for(int e = s; e < n; e++){
                sum += A[e];
                total += sum;
            }
        }
        return total;
    }
    //TC: O(n^2)
    //SC: O(1)

    static int optimized2(int[] A){
        System.out.println("Optimized-2 output");
        int n = A.length;
        int total = 0;

        for(int i = 0; i < n; i++){
           int count = (i+1)*(n-i);
           total += (A[i]*count);
        }
        return total;
    }
    //TC: O(n^2)
    //SC: O(1)


    public static void main(String[] args) {

        int[] A = {5,9,2};  
        System.out.println(optimized1(A));
        System.out.println(optimized2(A));

        
    }
    
}
