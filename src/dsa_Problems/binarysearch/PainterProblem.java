package dsa_Problems.binarysearch;

public class PainterProblem {
    public long maximumElement(int[] C) {

        long ans = Long.MIN_VALUE;

        for (int i = 0; i < C.length; i++) {
          if (C[i] > ans) {
            ans = C[i];
          }
        }
    
        return ans;
      }
    
      public long totalSumOfArray(int[] C) {
    
        long sum = 0;
    
        for (int i = 0; i < C.length; i++) {
          sum += (long)C[i];
        }
    
        return sum;
      }
    
      public boolean workCompleted(int[] C, int A, long mid) {
    
        long sum = 0;
        //Start with the painter 1
        int painters = 1;
    
        for(int i = 0; i < C.length; i++){
            sum += C[i];
            //check if sum is greater than mid
            if(sum > mid){
                //Assign the next element to sum
                sum = C[i];
                painters++;
            }
        } 
    
        //Check work completed with the painters
        if(painters <= A){
            return true;
        }
            
        return false;
      }
    
      public int paint(int A, int B, int[] C) {
    
        //check null
        if(C == null || C.length == 0){
            return -1;
        }
        int n = C.length;
        long ans = -1;
        //If painters are greater than boards
        if(A > n){
            return (int)((maximumElement(C) * B )% 10000003);
        }
    
        //Compute the search space
        long low = maximumElement(C);
        long high = (long)(totalSumOfArray(C));
    
        while(low <= high){
            //compute the mid value
            long mid = (long)(low + (high - low)/2);
    
            //if painters can complete work in mid time
            if(workCompleted(C, A, mid)){
                ans = mid;
                //move right to check for lesser time
                high = mid - 1;
            }else{
                //move left to check for the higher time
                low = mid + 1;
            }
        }
          
        return (int)((ans * B) % 10000003);
      }
}
