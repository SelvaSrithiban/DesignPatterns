package dsa_Problems.sortingAlgorithms;

public class CountPairsInTwoArrays {

    public static void smallestNumber(int[] A) {
    
        //A is null or size is 1
        if(A == null || A.length <= 1){
            return;
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
    
        return;
        }

    public static int solve(int[] A, int[] B){
        //check if any one of array is null
        if(A == null){
            return -1;
        }else if(B == null){
            return -1;
        }

        int n = A.length;
        int m = B.length;
        int count = 0;

        int i = 0;
        int j = 0;

        while(i < n && j < m){
            //check if A[i] < A[j]
            if(A[i] < B[j]){
                i++;
            }else{
                j++;
                count += n - i;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] A = {7,3,5};
        int[] B = {2,0,6};

        //sort the given arrays
        smallestNumber(A);
        smallestNumber(B);

        for(int a : A){
            System.out.print(a + " ");
        }


        System.out.println(solve(A,B));
        
    }

}
