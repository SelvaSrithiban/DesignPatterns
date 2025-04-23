package dsa_Problems.binarysearch;

public class SquareRoot {

    public int sqrt(int A) {

        int res = -1;
        //if A is -ve
        if(A < 0){
            return res;
        }
        // if A is 1 or 0
        if((A == 0) || (A == 1)){
            return A;
        }
        long low = 1;
        long high = A;

        while(low <= high){
            //calculate the mid value
            long mid = low + (high - low)/2;

            if((mid * mid) == A){
                return (int)mid;
            }else if((mid*mid) < A){   // if mid^2 is less than A
                res = (int)mid;
                low = mid + 1;
            }else{                   // if mid^2 is greater than B
                high = mid - 1;
            }

        }


        return res;

    }

}
