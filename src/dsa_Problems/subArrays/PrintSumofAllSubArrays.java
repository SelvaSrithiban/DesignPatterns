package dsa_Problems.subArrays;

public class PrintSumofAllSubArrays {

    static int optimized1(int[] A){
        System.out.println("Optimized output");
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


    public static void main(String[] args) {

        int[] A = {5,9,2};  
        
    }
    
}
