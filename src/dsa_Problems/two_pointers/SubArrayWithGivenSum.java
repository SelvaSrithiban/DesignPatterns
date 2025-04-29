package dsa_Problems.two_pointers;

public class SubArrayWithGivenSum {

    public int[] solve(int[] A, int B) {
        int n = A.length;
        int l = 0;
        int r = 0;
        long sum = A[0];
        while(r < n){
            
            //check if sum equals B
            if(sum == B){
                //create a new array
                int[] ans = new int[r-l+1];  
                int k = 0;
                for(int i=l; i <= r; i++){  //Traverse through the sub-array and update the ans array
                    ans[k] = A[i];
                    k++;
                }
                return ans;
            }else if(sum < B){  //if sum is less than B
                r++;            //increment the r pointer
                if(r < n){      //check r index to avoid index out ot bound issue
                sum += A[r];
                }
            }else{              // if sum is greater than B
                sum = sum - A[l];   //remove the older l element
                l++;                //increment the r pointer

            }
        }

        int[] ans = {-1};

        return ans;
    }

}
