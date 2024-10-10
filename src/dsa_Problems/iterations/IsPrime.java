package dsa_Problems.iterations;

public class IsPrime {

    public int countFactors(int A){
        int count = 0;
        int sqrt = (int)Math.sqrt(A);
        //Traverse the array until sqrt as both i and n%1 will be the factors of A
        for(int i = 1; i <= sqrt; i++){
            //check if n is divisible by n
            if(A % i == 0){
                if(i == A/i){
                    count ++;
                }else{
                    count += 2;
                }
            }
        }
        return count;
    }

    public int solve(int A) {
        if(countFactors(A) == 2){
            return 1;
        }
        return 0;
    }
    
}
