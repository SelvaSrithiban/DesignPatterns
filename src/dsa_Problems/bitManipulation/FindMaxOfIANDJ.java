package dsa_Problems.bitManipulation;

public class FindMaxOfIANDJ {

    public static int solve(int[] A){
        int n = A.length;
        int ans = 0;

        //Traverse from most significant bit to 0
        for(int i = 31; i >= 0; i--){
            //Check if the ith bit is set and increment count
            int cnt = 0;
            for(int j = 0 ; j < n; j++){
                if((A[j] & (1<<i)) != 0){
                    cnt++;
                }
            }

            //Check if cnt >= 2
            if(cnt >= 2){
                ans |= (1<<i);
            //set the element to 0
            for(int j = 0; j < n; j++){
                if((A[j] & (1<<j)) == 0){
                    A[j] = 0;
                }
            }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] A = {13,18,23,56,81,20,4,24,93};
        //int[] A = {53, 39, 88};
        System.out.println(solve(A));
        
    }
}
