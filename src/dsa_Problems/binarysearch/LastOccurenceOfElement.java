package dsa_Problems.binarysearch;

public class LastOccurenceOfElement {

    public static int findFirstOccurence(int[] A, int k){

        //check if the array is null or of size
        if(A == null){
            return -1;
        }

        int n = A.length;
        //check if the size is 1
        if(n == 1){
            if(A[0] == k){
                return 0;
            }
            return -1;
        }

        //Find the last occurence
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){
            //calculate the mid
            int mid = low + (high - low)/2; //to avoid the overflow

            if(A[mid] == k){  //check mid equals k
                ans = mid;
                low = mid + 1; //to find the first occurence
            }else if(A[mid] < k){ //check mid is less than k
                low = mid +1;
            }else{
                high = mid - 1;  //check mid is greater than l
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {-2,-2, 0, 0, 1,1, 3, 3,3,5,5,6,6,7,7,7};
        
        System.out.println(findFirstOccurence(arr, 3));
    }
    
}
