package dsa_Problems.countSort_mergeSort;

public class MergeSort {

    public static int[] merge( int[] A, int s, int m, int e, int[] aux) {

        //check if A is null
        if(A == null){
            return null;
        }
  
        //Traverse through given Array
        int i = s;
        int j = m+1;
        int k = 0;
        while(i <= m && j <= e){
            //check if the ith element is small
            if(A[i] <= A[j]){
                aux[k] = A[i];
                i++;
                k++;
            }else{
                aux[k] = A[j];
                j++;
                k++;
            }
        }
  
        //check if elements are still available in A 
        while(i <= m){
            aux[k] = A[i];
            i++;
            k++;
        }
  
         //check if elements are still available in B 
        while(j <= e){
            aux[k] = A[j];
            j++;
            k++;
        }

        //insert the sorted array into given 
        int n = 0;
        for(int l = s; l <= e; l++){
            A[l] = aux[n];
            n++;
        }
        
        return aux;
      }

      public static void mergeSort(int[] A, int s, int e, int[] aux){

        //Base case
        if(s == e){
            return;
        }

        int m = (s+e)/2;
        //Sorting the 1st half of array
        mergeSort(A, s, m, aux);
        //sorting the second half of arrray
        mergeSort(A, m+1, e, aux);
        //merge the sorted array
        merge(A, s, m, e, aux);
        
      }

      public static void main(String[] args) {
        
        int[] A = {3,10,6,8,15,2,12,18,17};
        int[] aux = new int[A.length];
        mergeSort(A, 0, A.length-1, aux);

        for(int a : A){
            System.out.print(a + " ");
        }
      }

      //TC: O(n*logn)
      //SC: O(n*logn)


}
