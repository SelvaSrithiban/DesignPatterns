package dsa_Problems.subArrays;

public class PrintMaxSumSubArrays {

    static int brutForce(int[] A){
        System.out.println("BrutForce output");
        int n = A.length;
        int max = Integer.MIN_VALUE;

        for(int s = 0; s < n;s++){
            for(int e = s; e< n; e++){
                int temp = 0;
                for(int i = s; i <= e; i++){
                    temp += A[i];
                }
                //System.out.println(temp);
                if(temp > max){
                    max = temp;
                }
            }
        }

        return max;
    }

    static int optimized1(int[] A){
        System.out.println("Optimized-1 output");
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int s = 0; s < n; s++){
            int sum = 0;
            for(int e = s; e < n; e++){
                sum += A[e];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    //TC: O(N^2)
    //SC: O(1)

    static int optimized2(int[] A){
        System.out.println("Optimized-2 output");
        int n = A.length;
        int ans = A[0];
        int cs = A[0];
        
        for(int i = 1; i < n; i++){
            //check if cs is greater than 0
            if(cs > 0){
                cs += A[i];
            }else{
                cs = A[i];
            }
            //check if current sum is greater than ans
            if(cs > ans){
                ans = cs;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] A = {5,9,2};   
        System.out.println(brutForce(A));
        System.out.println(optimized1(A));
        System.out.println(optimized2(A));
        
    }
    
}
