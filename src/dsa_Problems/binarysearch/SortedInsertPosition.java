package dsa_Problems.binarysearch;

public class SortedInsertPosition {

    public int searchInsert(int[] A, int B) {
        
        //check null
        if(A == null || A.length == 0){
            return -1;
        }
        int n = A.length;
        //If target not found in the array return the least element
        if(B < A[0]){
            return 0;
        }else if(B > A[n-1]){
            return n;
        }

        int low = 0;
        int high = n-1;

        //Traverse through the array
        while(low <= high){
            int mid = low + (high - low)/2;

            //if mid is lesser than target, move to right
            if(A[mid] < B){
                low = mid + 1;
            }else if(A[mid] > B){ //if mid is greater than target move left
                high = mid-1;
            }else{ //if mid equals target element
                return mid;
            }
        }

        //return low index if not found
        return low;
    }

}
