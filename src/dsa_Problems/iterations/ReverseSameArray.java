package dsa_Problems.iterations;

public class ReverseSameArray {
    public int[] solve(int[] A, int B, int C) {
        //Traverse until B < C and increment B and decrement C for every iteration
        while(B < C){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }
}
