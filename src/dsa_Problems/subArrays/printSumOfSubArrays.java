package dsa_Problems.subArrays;

public class printSumOfSubArrays {


    static void brutForce(int[] A){
        System.out.println("BrutForce output");
        int n = A.length;

        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                int sum = 0;
                for(int i = s; i <= e; i++){
                    sum += A[i];
                }
                System.out.println(sum);
            }
        }
        return;
    }
    //TC: O(N^3)
    //SC: O(1)


    static void optimized(int[] A){
        System.out.println("Optimized output");
        int n = A.length;

        for(int s = 0; s < n; s++){
            int sum = 0;
            for(int e = s; e < n; e++){
                sum += A[e];
                System.out.println(sum);
            }
        }
        return;
    }
    //TC: O(N^2)
    //SC: O(1)


    public static void main(String[] args) {
            int[] A = {5,9,2};      
            //brutForce(A);
            optimized(A);
            
    }
    
}
