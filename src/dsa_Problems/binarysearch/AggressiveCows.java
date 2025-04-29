package dsa_Problems.binarysearch;

import java.util.Arrays;

public class AggressiveCows {

    public boolean cowsCanBePlaced(int[] A, int mid, int B){

        int n = A.length;
        int cows = 1;    //no of cows places so far
        int lastCow = 0; //index where the last cow is placed

        for(int i = 0; i < n; i++){
            if(A[i] - A[lastCow] >= mid){  //check the difference bw the last cow and one which we're going place > mid
                cows++;
                lastCow = i;
            }

            if(cows >= B){   // if cows used equals B(given cows)
                return true;
            }
        }


        return false;
    }

    public int solve(int[] A, int B) {

        int ans = -1;
        int n = A.length;
        Arrays.sort(A);
        //Calculate the low
        int low = 1;

        //Calculate the high
        int high = A[n-1] - A[0];

        while(low <= high){
            int mid = low + (high-low)/2;

            //Check if we can place all the cows with mid value
            if(cowsCanBePlaced(A, mid, B)){
                ans = mid;
                low = mid+1; //look for other maximum values
            }else{
                high = mid-1; //if we cannot place cows
            }
        }

        return ans;
    }

}
