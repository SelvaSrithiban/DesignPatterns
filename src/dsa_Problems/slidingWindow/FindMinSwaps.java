package dsa_Problems.slidingWindow;

public class FindMinSwaps {

    static int optimized(int[] A, int B){
        int ans = 0;
        int n = A.length;
        int k = 0;   //Fixed length of Sub array to use sliding window Technique
        //Find the number of elements less than B
        for(int i = 0; i < n; i++){
            if(A[i] <= B){
                k++;
            }
        }
        int s = 0;
        int e = k-1;
        int swaps = 0;
        //Find swaps for first subarray of length k
        for(int j = s; j < k; j++){
            if(A[j] > B){
                swaps++;
            }
        }
        s++;
        e++;
        ans = swaps;
        //Find swap required for rest of the subarray
        while(e < n){
            //Check if the leaving element is greater than B
            if(A[s-1] > B){
                swaps--;
            }
            //Check if the incoming element is greater than B
            if(A[e] > B){
                swaps++;
            }
            if(swaps < ans){
                ans = swaps;
            }
            s++;
            e++;
        }
        

        return ans;
    }

    public static void main(String[] args) {
        
        int[] A = {19,11,3,9,7,25,6,20,4};
        int B = 10;
        System.out.println(optimized(A, B));
    }
    
}
