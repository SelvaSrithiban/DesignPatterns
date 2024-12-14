package dsa_Problems.countSort&mergeSort;

public class CountSortPositiveDigits {
    public int[] smallestNumber(int[] A) {
    
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
    
        int[] freq = new int[10];
        //Traverse through the and update the frequency of the index
        for(int i = 0; i < n; i++){
            freq[A[i]] = freq[A[i]] + 1;
        }
    
        //index of original array
        int k = 0;
        //Traverse through digit and get the frequency of it
        for(int d = 0; d <= 9; d++){
            //get the frequency of digit
            int count = freq[d];
            //Traverse from o to count
            for(int j = 0; j < count; j++){
                //update the value in the original array
                A[k] = d;
                k++;
            }
        }
    
        return A;
        }
        //SC: O(10) --> O(1)
        //TC: O(n+n) --> O(n)
}
