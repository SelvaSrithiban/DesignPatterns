package dsa_Problems.bitManipulation;

public class CheckEvenOdd {

    public static void checkEvenodd(int n){
        if((n&1)==1){
            System.out.println(n + " is a odd number.");
        }else{
            System.out.println(n + " is a even number.");
        }
    }

    public static void main(String[] args) {
        
        checkEvenodd(3);
    }
    
}
