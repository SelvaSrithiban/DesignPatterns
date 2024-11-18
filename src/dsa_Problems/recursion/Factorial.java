package dsa_Problems.recursion;

import java.nio.channels.Pipe.SourceChannel;

public class Factorial {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int temp = factorial(n-1);
        return temp * n;
    }
    //TC : O(n)
    //SC : O(n)
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
