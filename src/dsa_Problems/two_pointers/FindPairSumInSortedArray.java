package dsa_Problems.two_pointers;

public class FindPairSumInSortedArray {

    public static boolean solve(int[] A,int B){

        //check null
        if(A == null || A.length == 0){
            return false;
        }
        int n = A.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            //compute the sum
            int sum = A[i] + A[j];
            //if sum equals target
            if(sum == B){
                return true;
            }else if(sum < B){
                //move i pointer
                i++;
            }else{
                //sum is greater than B, move j pointer
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int[] A = {-3,0,1,3,6,8,11,14,18,25};
        int B = 5;

        System.out.println(solve(A,B));


    }

}
