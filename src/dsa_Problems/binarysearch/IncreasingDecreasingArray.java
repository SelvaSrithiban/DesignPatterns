package dsa_Problems.binarysearch;

public class IncreasingDecreasingArray {

    public static int solve(int[] A){

        //check null
        if(A == null || A.length == 0){
            return -1;
        }

        int n = A.length;
        int low = 0;
        int high = n-1;

        //Traverse through the array
        while(low <= high){
            //compute the mid value
            int mid = low + (high - low)/2;

            //check if mid is greater than adjacent elements
            if((mid == 0 || A[mid] > A[mid-1]) && (mid == n-1 || A[mid] > A[mid+1])){
                return A[mid];
            }else if((mid == 0 || A[mid] > A[mid-1]) && (mid == n-1 || A[mid] < A[mid+1])){  //check if mid is falls in the increasing part of array
                //move right
                low = mid + 1;
            }else{
                //move left
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        //int[] A = {1, 7 ,20, 30 ,40,36 ,27 ,4};
        int[] A = {2,4,6,8,7,5,1};

        System.out.println(solve(A));
        
    }

}
