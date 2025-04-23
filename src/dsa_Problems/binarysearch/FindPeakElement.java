package dsa_Problems.binarysearch;

public class FindPeakElement {
    public int solve(int[] A) {

        int low = 0;
        int n = A.length;
        int high = n - 1;
    
        while(low <= high){

            //Calculate the mid value
            int mid = low + (high - low)/2;

            //mid > mid-1 and mid > mid+1
            if(( mid == 0 || A[mid] >= A[mid-1]) && (mid == n-1 || A[mid] >= A[mid+1])){
                return A[mid];
            }else if((mid > 0 && A[mid] < A[mid-1])){   //search on left
                high = mid-1;
            }else{   //search on right
                low = mid+1;
            }
        }

        return -1;
    }

}
