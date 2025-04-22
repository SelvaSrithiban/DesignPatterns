public class SwiftLeftToRight {

    static void reverseArray(int[] A, int s, int e){
        while(s < e){
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return;

    }

    static void rotateArray(int[] A, int k){

        //check if array is null
        if(A == null){
            return;
        }

        int n = A.length;
        
        k = k % n;
        //reverse the entire array
        reverseArray(A, 0, n-1);
        //reverse the first part
        reverseArray(A, 0, n-k-1);
        //reverse the second part
        reverseArray(A, n-k, n-1);

        return;
    }

    public static void main(String[] args) {
        
        int[] A = {6,4,2,1,3,9};

        rotateArray(A, 2);

        for(int a : A){
            System.out.println(a);
        }
    }

}
