package dsa_Problems.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindElementInSortedArray {

    public static int binarySearch(List<Integer> A, int k){
        int n = A.size();

        //check if list size is 1
        if(n == 1){
            if(A.get(0) == k){
                return 0;
            }
        }

        int low = 0;
        int high = A.size()-1;

        //run the loop until low <= high
        while(low <= high){
            //calculate the mid
            int mid = low + (high - low)/2;   //To avoid overflow
            //check the mid
            if(A.get(mid) == k){
                return mid;
            }else if(A.get(mid) < k){ //if mid is less than k, move to the right
                low = mid+1;
            }else{  //if mid is greater than k, move to the left
                high = mid - 1;
            }
            
        }

        return -1;
    }

    //TC - O(logn)
    //SC - O(1)
    
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,3,5,7,9));

        System.out.println(binarySearch(list, 9));

        
    }
}
