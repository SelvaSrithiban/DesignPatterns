package dsa_Problems.bitManipulation;

public class UnsetBitsRange {
    
    public static int brutForce(int n, int B){
        int ans = n;
        for(int i = 0; i < B; i++){

            if( (n & (1 << i)) != 0){
                ans -= (1<<i);
            }
        }

        return ans;
    }

    public static int optimized(int n, int B){
       
            int mask = ~((1 << B) - 1); // Create a mask with B rightmost bits set to 0
            return n & mask;             // Clear the B rightmost bits in A
    }
    

    public static void main(String[] args) {
        
    }
}
