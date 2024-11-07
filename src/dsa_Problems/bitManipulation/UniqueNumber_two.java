package dsa_Problems.bitManipulation;

public class UniqueNumber_two {

    public static int optimized(final int[] A) {
        int ans = 0;
        int n = A.length;

        //Traverse from Bit 0 to 31
        for(int i = 0; i < 32; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                //check if the ith bit is set
                if((A[j] & (1<<i)) > 0){
                    cnt++;
                }
            }
            //Set the ith bit if modula of count is 1
            if(cnt % 2 == 1){
                ans = (ans | (1<<i));
            }
        }
        return ans;
    }
    //TC : O(1)
    //SC : O(1)

    public static int bruteforce(final int[] A) {
        int ans = 0;
        int n = A.length;

        for(int i = 0; i < n; i++){
            ans ^= A[i];
        }
        
        return ans;
    }
    //TC : O(1)
    //SC : O(1)

    public static void main(String[] args) {

        int[] A = {1,2,2,4,4,5,5};
        System.out.println(bruteforce(A));
        System.out.println(optimized(A));

        
    }
    
}
