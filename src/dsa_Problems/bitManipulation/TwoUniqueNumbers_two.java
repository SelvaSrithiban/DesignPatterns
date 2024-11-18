package dsa_Problems.bitManipulation;

public class TwoUniqueNumbers_two {

    

    public static int[] solve(int[] A){
        int[] ans = new int[2];
        int n = A.length;

        int tmp = 0;

        //Traverse through entire and XOR
        for(int i = 0; i < n; i++){
            tmp ^= A[i];
        }

        System.out.println("Value of tmp is " + tmp);

        int bit = 0;
        //Retrieve the 1st bit which is set
        for(int j = 0; j < 32; j++){
            if((tmp & (1<<j)) != 0){
                //System.out.println(j + " Inside the loop " + (tmp & (1<<j)) );
                bit = j;
                break;
            }
        }

        //System.out.println("Value of bit is " + bit);

        int tmp1 = 0;
        int tmp2 = 0;
        //Seggreagte where ith bit set to tmp1 and unset to tmp2
        for(int k = 0; k < n; k++){
            if((A[k] & (1<<bit)) != 0){
                tmp1 ^= A[k];
            }else{
                tmp2 ^= A[k];
            }
        }

        //check if tmp1 > tmp2
        if(tmp1 > tmp2){
            int temp = tmp1;
            tmp1 = tmp2;
            tmp2 = temp;
        }

        //Feed the values to ans array
        ans[0] = tmp1;
        ans[1] = tmp2;

        return ans;
    }
    //TC : O(1)
    //SC : O(1)
    public static void main(String[] args) {
        //int[] A = {186,256,102,377,186,377};
        //int[] A = {16,32,16,32,8,4};
        int[] A = {1,2,6,1,2,4};
        int[] ans = solve(A);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
