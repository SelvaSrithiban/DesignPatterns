package dsa_Problems.prefixSum;

public class CountEvenNumbers {

    static int[] prefixCount(int[] a){
        int n = a.length;
        int[] pc = new int[n];

        if(a[0] % 2 == 0){
            pc[0] = 1;
        }else{
            pc[0] = 0;
        }
        
        for(int i = 1; i < n; i++){
            if(a[i] % 2 == 0){
                pc[i] = pc[i-1] + 1;
            }else{
                pc[i] = pc[i-1];
            }
        }
        return pc;
    }

    static void findEquilibriumIndex(int[] a, int[][] q){
        int pc[] = prefixCount(a);

        for(int i = 0; i < q.length; i++){
            int l = q[i][0];
            int r = q[i][1];
            int ans = 0;

            if(l == 0){
                ans = pc[r];
            }else{
                ans = pc[r] - pc[l-1];
            }
            System.out.println(ans);
        }
        return;
        //TC: O(n+q)
        //SC: O(1)
    }

    public static void main(String[] args) {
        int[] a = {3,5,8,9,16,14,13,12};
        int[][] q = {{0,2},{2,6},{4,5}};
        
        findEquilibriumIndex(a, q);
        /* 
        int[] pc = prefixCount(a);
        for(int i = 0; i < pc.length; i++){
            System.out.print(pc[i] + " ");
        }
        */
    }
}
