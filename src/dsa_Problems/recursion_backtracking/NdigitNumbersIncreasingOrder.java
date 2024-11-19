package dsa_Problems.recursion_backtracking;

public class NdigitNumbersIncreasingOrder {

    public static void solve(int[] ans, int i,int n){

        //base case
        if(i == n){
            for(int k = 0; k < n; k++){
                System.out.print(ans[k]);
            }
            System.out.println();
            return;
        }


        //Two Options
        ans[i] = 1;
        solve(ans, i+1, n);

        ans[i] = 2;
        solve(ans, i+1, n);

        return;
    }

    public static void generate(int n){
        int[] ans = new int[n];
        solve(ans, 0, n);
    }

    public static void main(String[] args) {

        generate(3);
        
    }
    
}
