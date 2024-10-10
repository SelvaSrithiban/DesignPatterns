package dsa_Problems.iterations;

public class SwiftRightToLeft {
    
    public static int[] reverseArray(int[] A, int s, int e){
        while(s < e){
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }

    public int[] solve(int[] A, int B) {
        //Calculate the net rotation
        int l = A.length;
        int nr = B % l;
        System.out.println("Prinitng the net rotation value " + nr);
        //if net rotation is 
        if(nr == 0){
            return A;
        }else{
           reverseArray(A, 0, l-1);
           reverseArray(A, 0, nr-1);
           reverseArray(A, nr, l-1);
        }
        return A; 
    }

}
