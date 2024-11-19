package dsa_Problems.recursion_backtracking;

public class CountSubsetWithSumK {

    public static int solve(int[] A, int i, int sum, int k){
        
        //Base case
        if(i == A.length){
            if(sum == k){
                return 1;
            }else{
                return 0;
            }
        }
        //Two Options
        //Including next element
        int a = solve(A, i+1, sum + A[i], k);
        //Excluding Next element
        int b = solve(A, i+1, sum , k);

        return a+b;
    }
    
    public static void main(String[] args) {
        int[] A = {5,7,2};
        int k = 7;
        System.out.println(solve(A, 0 , 0, k));

    }
}
