package dsa_Problems.two_pointers;
/***************************When elements are distinct***********/
public class FindAllSumPairsInSortedArray {

    public static int solve(int[] A,int B){

        //check null
        if(A == null || A.length == 0){
            return -1;
        }
        int n = A.length;
        int i = 0;
        int j = n-1;
        int count = 0;

        while(i < j){
            //compute the sum
            int sum = A[i] + A[j];
            //if sum equals target
            if(sum == B){
                count++;
                i++;
                j--;
            }else if(sum < B){
                //move i pointer
                i++;
            }else{
                //sum is greater than B, move j pointer
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] A = {2,5,7,10,12,15};
        int B = 17;

        System.out.println(solve(A, B));
        
    }

}
