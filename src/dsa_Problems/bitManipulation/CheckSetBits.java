package dsa_Problems.bitManipulation;

public class CheckSetBits {

    public static int brutForce(int n){
        int count = 0;

        for(int i = 0; i < 32; i++){
            if((n & (1<<i)) != 0){
                count++;
            }
        }
        return count;
    }

    public static int optimized(int n){
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1); // clears the lowest set bit
        }
        return count;
    }
    
    public static void main(String[] args) {

        System.out.println(brutForce(13));
        System.out.println(optimized(13));
        
        
    }
}
