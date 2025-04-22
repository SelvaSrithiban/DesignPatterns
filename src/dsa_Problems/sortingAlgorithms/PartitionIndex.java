package dsa_Problems.sortingAlgorithms;

public class PartitionIndex {

    public int partition(int[] arr) {
        // code here
        //if arr is null
        if(arr == null){
            return -1;
        }
    
        int n = arr.length;
        if(n == 2){
            int i = 0;
            int j = 1;
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return i;
        }
    
        //use two pointer
        int i = 0; 
        int j = 0;
        int x = arr[n-1];
        while(j < n-1){
            //check if arr[j] < arr[x], swap i and j and increment both
            if(arr[j] < x){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    
        //swap the i the element with n-1
        int temp = arr[i];
        arr[i] = arr[n-1];
        arr[n-1] = temp;
    
        return i;
    }

}
