package dsa_Problems.sortingAlgorithms;

import java.sql.Time;

public class QuickSort {

    public void quickSort(int[] A, int s, int e){

        //egde case
        if(s >= e){
            return;
        }

        //Choose the pivot element
        int x = A[e];
        //Choose the i pointer
        int i = s;
        for(int j = s; j < e; j++){
            //Swap i and j
            if(A[j] < x){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
            }
        }

        //Swap the pivot element to the current index
        int p = i;
        int temp = A[i];
        A[i] = A[e];
        A[e] = temp;

        quickSort(A, s, p-1);
        quickSort(A, p+1, e);
        

    }
    public int[] solve(int[] A) {

        //if A is null
        if(A == null || A.length == 0){
            return A;
        }

        quickSort(A, 0, A.length-1);

        return A;
    }

    /* 
	•	Time Complexity:
	•	Best Case: O(n \log n)
	•	Worst Case: O(n^2)
	•	Average Case: O(n \log n)
	•	Space Complexity:
	•	Best Case: O(\log n)
	•	Worst Case: O(n) */

}
