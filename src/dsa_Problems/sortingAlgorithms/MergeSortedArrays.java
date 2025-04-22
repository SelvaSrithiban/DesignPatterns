package dsa_Problems.sortingAlgorithms;

public class MergeSortedArrays {

    public int[] solve(final int[] A, final int[] B) {

        //check if A or B is null
        if(A == null){
            return B;
        }else if(B == null){
            return A;
        }
  
        //Create a new array of size n+m 
        int n = A.length;
        int m = B.length;
        int[] sortedArray = new int[n+m];
  
        //Traverse through given A and B and sort IT
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            //check if the ith element is small
            if(A[i] <= B[j]){
                sortedArray[k] = A[i];
                i++;
                k++;
            }else{
                sortedArray[k] = B[j];
                j++;
                k++;
            }
        }
  
        //check if elements are still available in A 
        while(i < n){
            sortedArray[k] = A[i];
            i++;
            k++;
        }
  
         //check if elements are still available in B 
        while(j < m){
            sortedArray[k] = B[j];
            j++;
            k++;
        }
        
        return sortedArray;
      }
      //TC: O(n+m);
      //SC: O(1) --> Since in the question we were asked to create a new array

}
