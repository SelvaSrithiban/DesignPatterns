package dsa_Problems.recursion;

public class FibonacciSeries {

    public static int fib(int n){

        //base case
        if(n == 0|| n == 1){
            return n;
        }

        //Main Logic
        int a = fib(n-1);
        int b = fib(n-2);
        return a + b;

    }
    //TC: O(2^n)
    //SC: O(n)
    
    public static void main(String[] args) {

        
    }
}
