package dsa_Problems.bitManipulation;

public class SumOfXOROfALL {

    public int solve(int[] A) {
        int n = A.length;
        int sum = 0;
        int mod = 1000000007;

        for(int i = 0; i < 31; i++){
            int x =0;
            int y = 0;
            for(int j = 0; j < n;j++){
                if((A[j] & (1<<i)) != 0){
                    x++;
                }else{
                    y++;
                }
            }

            //sum += (x * y) * (1<<i) ;
            //sum = sum % mod;
            sum = (sum + (int)(((long) x * y % mod) * (1 << i) % mod)) % mod;
        }

        return sum;
    }
    
}
