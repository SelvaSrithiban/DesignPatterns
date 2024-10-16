package dsa_Problems.carryForward;

public class FindLeadersLeft {

    static int brutForce(int[] A){
        int n = A.length;
        int ans = 1;
        for(int i = 1; i < n; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++){
                if(A[j] > max){
                    max = A[j];
                }
            }
            //check if the A[i] is greater than highest element in the left side
            if(A[i] > max){  
                ans++;
            }
        }
        return ans;
    }
    //SC: O(1)
    //TC: O(n^2)

    static int optimized(int[] A){
        int n = A.length;
        int ans = 1;
        int max = A[0];
        for(int i = 1; i < n; i++){
            if(A[i] > max){
                ans++;
                max = A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A = {16,17,4,3,5,2};
        int[] B = {4,2,3,9,7,10};
        System.out.println(brutForce(A));
        System.out.println(brutForce(B));
        System.out.println(optimized(B));
        
    }
}
