package dsa_Problems.countSort_mergeSort;

public class MergeArrayWithSME {

    public static int[] solve(final int[] A, int s, int m, int e) {

        //check if A is null
        if(A == null){
            return null;
        }
  
        //Create a new array of size e-s+1 
        int[] sortedArray = new int[e-s+1];
  
        //Traverse through given Array
        int i = s;
        int j = m+1;
        int k = 0;
        while(i <= m && j <= e){
            //check if the ith element is small
            if(A[i] <= A[j]){
                sortedArray[k] = A[i];
                i++;
                k++;
            }else{
                sortedArray[k] = A[j];
                j++;
                k++;
            }
        }
  
        //check if elements are still available in A 
        while(i <= m){
            sortedArray[k] = A[i];
            i++;
            k++;
        }
  
         //check if elements are still available in B 
        while(j <= e){
            sortedArray[k] = A[j];
            j++;
            k++;
        }

        //insert the sorted array into given 
        int n = 0;
        for(int l = s; l <= e; l++){
            A[l] = sortedArray[n];
            n++;
        }
        
        return sortedArray;
      }
      //TC: O(e-s+1);
      //SC: O(e-s+1) 
      public static void main(String[] args) {
        
        int[] A = {4,8,-1,2,6,9,11,3,4,7,1,3,0};
        solve(A,2,6,9);
        for(int a : A){
            System.out.print(a + " ");
        }
      }

    
}
