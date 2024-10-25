package dsa_Problems.slidingWindow;

public class FindMaxSubArrayOfLengthK {

    public static int[] prefixSum(int[] A){
        int n = A.length;
        int[] ps = new int[n];
        ps[0] = A[0];
        for(int i = 1; i < n; i++){
            ps[i] = ps[i-1] + A[i];
        }
        return ps;
    }

    public static int brutForce(int[] A, int k){
        System.out.println("Brut Force Output");
        int n = A.length;
        int s = 0;
        int e = k-1;
        int ans = Integer.MIN_VALUE;

        while(e < n){
            //find the sum of sub array from s to e
            int sum = 0;
            for(int i = s; i <= e; i++){
                sum += A[i];
            }
            //check if sum is greater than ans
            if(sum > ans){
                ans = sum;
            }
            s++;
            e++;
        }
        return ans;
    }
    //TC : O(n*k)
    //SC : O(1)

    public static int optimized1(int[] A, int k){
        System.out.println("Optimized-1 Force Output");
        int n = A.length;
        int s = 0;
        int e = k-1;
        int ps[] = prefixSum(A);
        int ans = Integer.MIN_VALUE;

        while(e < n){
            //find the sum of sub array from s to e
            int sum = 0;
            if(s == 0){
                sum = ps[e];
            }else{
                sum = ps[e] - ps[s-1];
            }
            
            //check if sum is greater than ans
            if(sum > ans){
                ans = sum;
            }
            s++;
            e++;
        }
        return ans;
    }

    //TC : O(n)
    //SC : O(n)

    public static int optimized2(int[] A, int k){
        System.out.println("Optimized-2 Force Output");
        int n = A.length;
        int s = 0;
        int e = k-1;

        //Sum of 1st window
        int sum = 0;
        for(int i = 0; i <= e; i++){
            sum += A[i];
        }
        int ans = sum;
        s++;
        e++;

        while(e < n){
            //find the sum of sub array from s to e
            sum = sum - A[s-1] + A[e];
            //check if sum is greater than ans
            if(sum > ans){
                ans = sum;
            }
            s++;
            e++;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A = {2,4,-1,3,5};
        System.out.println(brutForce(A, 3));
        System.out.println(optimized1(A, 3));
        System.out.println(optimized2(A, 3));
        
    }


}