package dsa_Problems.recursion;

public class Sample {

    public static void fun(int n){
        System.out.println("hi");
        fun(3);
    }
    
    public static void main(String[] args) {

        fun(2);
        
    }
}
