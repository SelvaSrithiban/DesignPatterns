package dsa_Problems.binarysearch;

public class FindElementInRotatedSortedArray {

    public static int solve(int[] A, int B){

        //check null
        if(A == null || A.length == 0){
        return -1;
        }

        int n = A.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            //compute the mid value
            int mid = low + (high - low)/2;

            //if mid is target
            if(A[mid] == B){
                return mid;
            }else if(B < A[0]){ //check if target is second subarray
                //check where the mid lies
                if(A[mid] < A[0]){
                    //both mid and target lies in the second subarray
                    if(A[mid] < B){
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
                }else{
                    //mid lies in the first subarray, move right
                    low = mid + 1;
                }
            }else{ //target is in first subarray
                //check where the mid lies
                if(A[mid] >= A[0]){
                    //both mid and target lies in the first subarray
                    if(A[mid] < B){
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
                }else{
                    //mid lies in the second subarray, move left
                    high = mid - 1;
                }
            } 
            }
        return -1;
    }

    public static void main(String[] args) {

        int[] A = {10,20,30,1,2,3,4,5,6,7,8,9};
        System.out.println(solve(A,7));
        
    }

}
