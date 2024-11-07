package dsa_Problems.bitManipulation;

public class CheckIthBit {

    public static boolean checkIthbit(int n, int i){

        if((n & (1<<i)) != 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 17, i = 2;
        System.out.println(checkIthbit(n, i));
    }
    
}
