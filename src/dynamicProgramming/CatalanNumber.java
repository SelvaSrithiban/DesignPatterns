package dynamicProgramming;

public class CatalanNumber {

    public int[] catalanNumber(int n){

        int[] c = new int[n];

        c[0] = 1;
        c[1] = 1;

        for(int i = 2; i < n; i++){
            for(int j = 0; j < i; j++){
                c[i] = c[j]*c[i-1-j];
            }
        }

        return c;
    }

}
