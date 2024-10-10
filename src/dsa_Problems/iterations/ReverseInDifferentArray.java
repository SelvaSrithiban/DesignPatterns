package dsa_Problems.iterations;

public class ReverseInDifferentArray {
    public int[] solve(final int[] A) {
        int l = A.length;
        int[] ans = new int[l];
        int j = 0;
        //Traverse through the give array from n-1 to 0
        for(int i = l-1; i >= 0; i--){
            ans[j] = A[i];
            j++;
        }
        return ans;
    }
}
