package dsa_Problems.iterations;

public class CountPrimeNumber {

    public static int countFactors(int A){
        int sqr = (int)(Math.sqrt(A));
        int count = 0;
        for(int i = 1; i <= sqr; i++){
            if(A % i == 0){
                if( i == A/i){
                    count++;
                }else{
                    count += 2;
                }
            }
        }
        return count;
    }
    
    public int solve(int A) {
        //if A is <= 1, return 0
        int count = 0;
        if(A <= 1){
            return 0;
        }else{
            for(int i = 2; i <= A; i++){
                if(countFactors(i) == 2){
                    count++;
                }
            }
            return count;
        }
    }
    
}
