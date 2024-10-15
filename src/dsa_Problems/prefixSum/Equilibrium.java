package dsa_Problems.prefixSum;

public class Equilibrium {

    static int[] prefixSum(int[] a){
        int n = a.length;
        int[] ps = new int[n];
        ps[0] = a[0];
        for(int i = 1; i < n; i++){
            ps[i] = ps[i-1] + a[i];
        }
        return ps;
        //TC --> O(n)
    }

    static int findEquilibriumIndex(int[] A){
        int[] ps = prefixSum(A);
        int count = 0;
        int n = A.length;
        System.out.println(count + "Before loop");
        for(int i = 0; i < n; i++){
            int ls = 0;
            if(i > 0){
                ls = ps[i-1];
            }
            int rs = ps[n-1] - ps[i];
            if(ls == rs){
                count++;
            }
            System.out.println(count + "Inside loop");
        }
        System.out.println(count + "Before return");
        return count;
        //TC -->O(n+n) --> O(n)
        //SC -->O(1)
    }
    
    public static void main(String[] args) {

        //int[] A = {1,0,-2,4,-3,0};
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumIndex(A));
        
    }
}
