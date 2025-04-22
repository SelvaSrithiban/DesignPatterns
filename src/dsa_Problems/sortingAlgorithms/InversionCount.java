package dsa_Problems.sortingAlgorithms;

public class InversionCount {

    public static int merge(int[] A, int s, int mid, int e, int[] aux){
        int count = 0;
        int[] C = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;

        while((i <= mid) && (j <= e)){
            //Move the i pointer to right
            if(A[i] <= A[j]){
                C[k] = A[i];
                i++;
                k++;

            }else{
                C[k] = A[j];
                j++;
                k++;
                //Calculate the count in the divided array
                count += mid - i +1; 
            }
        }

        while(i <= mid){
            C[k] = A[i];
            i++;
            k++;
        }

        while( j <= e){
            C[k] = A[j];
            j++;
            k++;
        }
        k =0 ;
        for(i = s; i <= e; i++){
            A[i] = C[k];
            k++;
        }

        return count % (1000000007);
    }

    public static int inversion(int[] A, int s, int e, int[] aux){

        //base class 
        if( s == e){
            return 0;
        }

        int count = 0;
        int mid = (s+e)/2;

        //sum up the count value for every recusive call
        count += inversion(A, s, mid, aux);
        count += inversion(A, mid+1, e, aux);
        count += merge(A, s, mid, e, aux);

        return count % (1000000007);
    } 

    public static int solve(int[] A) {

        int s = 0;
        int e = A.length-1;
        int[] aux = new int[e];
        int ans = inversion(A, s, e, aux);

        return ans;
    }
    //TC : O(nlogn)
    //SC : O(n) --> Since we are using Auxillary array

    public static void main(String[] args) {

        int[] A = {5,3,1,4,2};
        System.out.println(solve(A));
        
    }



}
