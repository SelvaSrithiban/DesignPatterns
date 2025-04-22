package dsa_Problems.sortingAlgorithms;

public class Sort01 {
    
    public int[] sort01(int[] A) {

        //check it A is null
        if(A == null){
            return null;
        }
        int n = A.length;
        //check if the size is 1
        if(n == 1){
            return A;
        }

        //Use two pointers i and j
        int i = 0;
        int j = 0;

        while(j < n){
            //if current element is 1, increment j else swap the element i and j and increment both
            if(A[j] == 1){
                j++;
            }else{
                //Swap the elements
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j++;
            }
        }

        return A;
    }
}
