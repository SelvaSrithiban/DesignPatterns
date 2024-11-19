package dsa_Problems.recursion_backtracking;

public class FindNNaturalNumbers {

    public static int sum(int n){

        if(n == 0){
            return 0;
        }

        int temp = sum(n-1);
        return temp + n;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
