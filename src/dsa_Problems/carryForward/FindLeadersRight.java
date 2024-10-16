package dsa_Problems.carryForward;

public class FindLeadersRight {

    static int[] optimized(int[] A){
        int n = A.length;
        int[] ans = new int[n];
        int max = A[n-1];
        int count = 0;
        ans[count++] = A[n-1];
        for(int i = n-2; i >=  0; i--){
            if(A[i] > max){
                ans[count++] = A[i];
                max = A[i];
            }
        }

        int[] result = new int[count];
        System.out.println(count);
        for(int i = 0; i < count; i++){
            result[i] = ans[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {16,17,4,3,5,2};
        int[] ans = optimized(A);
        
    }
    
}
