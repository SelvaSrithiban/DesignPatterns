package dsa_Problems.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class LocalMinima {

    public static int localMinima(int[] A){

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

            //if mid is a local minima
            if((mid == 0 || A[mid] < A[mid-1]) && (mid == n-1 || A[mid] < A[mid+1])){
                return A[mid];
            }else if((mid == 0 || A[mid] > A[mid-1]) && (mid == n-1 || A[mid] < A[mid+1])){
                //move left
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] A= {3,6,2,2,9,15,8};

        System.out.println(localMinima(A));
        
    }

}
