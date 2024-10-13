package dsa_Problems.prefixSum;

public class RangeSumQuery {

    static int[] prefixSum(int[] a){
        int n = a.length;
        int[] ps = new int[n];
        ps[0] = a[0];
        for(int i = 1; i < n; i++){
            ps[i] = ps[i-1] + a[i];
        }
        return ps;
        //TC --> O(N)
    }

    static void optimizedQuery(int[] a, int[][] q){
        int[] ps = prefixSum(a);
        for(int i = 0; i < q.length; i++){
            int l = q[i][0];
            int r = q[i][1];
            int sum = 0;
            if(l == 0){         //edge case to avoid index out of bounds
                sum = ps[r];
            }
            else{
                sum = ps[r] - ps[l-1];
            }
            System.out.println(sum);
        }
    //TC --> q+n --> O(q+n)
    //SC --> O(n)
    }

   static void brutForce(int[] a, int[][] q){
    for(int i = 0; i < q.length; i++){
        int l = q[i][0];
        int r = q[i][1];
        int sum = 0;
        for(int j = l; j <= r; j++){
            sum += a[j];
        }
        System.out.println(sum);
    }
    //TC --> O(q*n)
    //SC --> O(1)
   }

    public static void main(String[] args) {
        
        int[] a = {2,4,3,7,1,9};
        int[][] query = {{0,4},
                        {2,4},
                        {1,1}
                        };
        brutForce(a, query);
        System.out.println("*****************");
        optimizedQuery(a, query);
    }

}