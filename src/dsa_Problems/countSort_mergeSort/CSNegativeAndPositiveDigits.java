package dsa_Problems.countSort_mergeSort;

import java.util.Arrays;

public class CSNegativeAndPositiveDigits {

    public static int[] smallestNumber(int[] A) {
    
        //A is null or size is 1
        if(A == null || A.length <= 1){
            return A;
        }
        int n = A.length;
        //if size is 2
        if(n == 2){
            if(A[0] > A[1]){
                int temp = A[0];
                A[0] = A[1];
                A[1] = temp;
            }
        }
        //Compute min and maximum element in array
        int min = Arrays.stream(A).min().orElseThrow(null);
        int max = Arrays.stream(A).max().orElseThrow(null);

    
        int[] freq = new int[max - min + 1];
        //Traverse through the and update the frequency of the index
        for(int i = 0; i < n; i++){
            //compute the index
            int index = A[i] + Math.abs(min);
            freq[index] = freq[index] + 1;
        }
    
        //index of original array
        int k = 0;
        //Traverse through min to max
        for(int d = min; d <= max; d++){
            //compute the index
            int index = d + Math.abs(min);
            //get the frequency of digit
            int count = freq[index];
            
            //Traverse from o to count
            for(int j = 0; j < count; j++){
                //update the value in the original array
                A[k] = d;
                k++;
            }
        }
    
        return A;
    }
        //SC: O(10) --> O(max - min + 1)
        //TC: O(n+n) --> O(n)

    public static void main(String[] args) {
        
        int[] A = {-3,2,2,1,-4,5,-3};
        smallestNumber(A);

        for(int a : A){
            System.out.print(a + " ");
        }
    }
    
}
