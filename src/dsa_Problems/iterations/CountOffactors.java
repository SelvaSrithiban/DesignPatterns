package dsa_Problems.iterations;

/*
 * 
 Brut force:  n%i == 0   then i is a factor of n                             //Time complexity will be O(N)
for(int i = 1; i <= n; i++)

Optimised logic:  Both i and n/i are the factors of n                       ////Time complexity will be O(sqrt(N))
for(int i = 1; i*i <= n; i++)   // for(int i = 1; i <= (int)(Math.sqrt(n)); i++)
Make sure, you cover the edge case when i and n/i are same.
 */

public class CountOffactors {

    public int solve(int A) {
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
    
}
