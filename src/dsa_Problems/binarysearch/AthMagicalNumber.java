package dsa_Problems.binarysearch;

public class AthMagicalNumber {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

     public static long leastCommonMultiple(int a, int b) {
        return (a * 1L*b) / gcd(a, b);
    }

    public long countMultiple(long mid, int B, int C){
        long count = 0;
        long lcm = leastCommonMultiple(B,C);

        count = (mid/B) + (mid/C) - (mid/lcm);

        return count;
    }
    public int solve(int A, int B, int C) {

        long res = -1;
        long a = A;
        //calculate the low and high value
        long low = 1;
        long high = a * (Math.min(B,C));

        while(low <= high){
            //Calculate the mid value
            long mid = low + (high - low)/2;

            //if the count until the midpoint < A
            if(countMultiple(mid, B, C) < a){
                low = mid+1;
            }else if(countMultiple(mid, B, C) > a){ //if the count until the midpoint > A, move left
                high = mid-1;
            }else{         //if equals A, move right 
                res = mid;          
                high = mid-1;
            }

        }
        return (int)(res%1000000007);
    }

}
