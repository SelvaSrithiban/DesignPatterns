package dsa_Problems.bitManipulation;

public class UniqueNumber_three {

    public int singleNumber(final int[] A) {
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
            if(cnt % 3 == 1){
                ans = (ans | (1<<i));
            }
        }

        return ans;
    }
    
}
