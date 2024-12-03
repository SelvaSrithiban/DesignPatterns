package dsa_Problems.iterations;

public class SmallestPrimeFactor {

    public static int[] smallestPrimeFactor(int N){
        //create a array of size N
        int[] spf = new int[N+1];

        //Set all the elements in the array with i as smallest prime factor
        for(int i = 0; i <= N; i++){
            spf[i] = i;
        }

        //Traverse through the array from 2
        for(int i = 2; i <= N; i++){
            //check if the ith element is unchanges
            if(spf[i] == i){
                //Traverse through the multiples of jth element
                for(int j = i*i; j <= N; j=j+i){
                    //check if the jth element is unchanges
                    if(spf[j] == j){
                        //set i as smallest prime factor
                        spf[j] = i;
                    }
                }
            }
        }
    return spf;
    }

    //TC : O(N log(log N))
    //SC: O(1)

    public static void main(String[] args) {


        
    }
}

