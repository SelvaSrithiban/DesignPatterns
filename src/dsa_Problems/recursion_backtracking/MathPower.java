package dsa_Problems.recursion_backtracking;

public class MathPower {

    public static int p1(int a, int n){
        if(n == 0){
            return 1;
        }

        int temp = p1(a, n-1);
        return temp * a;
    }
    //TC : O(1)

    public static int p2(int a, int n){
        if(n == 0){
            return 1;
        }

        int temp = p1(a, n/2);
        if(n % 2 == 0){
            return temp * temp;
        }else{
            return temp * temp * a;
        }
    }
    //TC : O(logn)
    //SC : O(logn)
    
    public static void main(String[] args) {

        System.out.println(p1(2,4));
        System.out.println(p2(2,4));
        
    }
}
