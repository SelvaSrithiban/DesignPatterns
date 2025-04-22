package dsa_Problems.binarysearch;

public class SingleElementInSortedArray {

    public int solve(int[] A) {

        //check null
        if(A == null || A.length == 0){
            return -1;
        }
        int n = A.length;
        int low = 0;
        int high = n-1;
 
        while(low <= high){
            int mid = low + (high - low)/2;
 
            //if mid is unique
            if((mid == 0 || (A[mid - 1] != A[mid])) && (mid == n-1 || A[mid + 1] != A[mid])){
                return A[mid];
            }else if(mid == 0 || A[mid] == A[mid-1]){ //if the first occurence is on the left
                 //if index is odd, move to right
                 if(mid % 2 == 1){ 
                     low = mid+1;
                 }else{ //move left if index is even
                     high = mid-1;
                 }
            }else if(mid == n-1 || A[mid] == A[mid+1]){ //if the last occurence is on the right
                 //if index is odd, move to left
                 if(mid % 2 == 1){
                     high = mid-1;
                 }else{ //move right if index is even
                     low = mid+1;
                 }
            }
        }
 
        return -1;
     }

}
