package comparator;

import java.util.Arrays;

public class CountFactorsCustomSort {
    
    public int countFactors(int n){
        int factors = 0;

        for(int i = 1; i *i <= n; i++){
            //check if n is divisible by i
            if(n % i == 0){
                //increment once if i and n/i are equal
                if(i == n/i){
                    factors++;
                }else{
                    factors += 2;
                }
            }
        }

        return factors;
    }
    public int[] solve(int[] A) {

        // Convert int[] to Integer[] for custom sorting
        Integer[] arr = Arrays.stream(A).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a,b) -> {
            int ca = countFactors(a);
            int cb = countFactors(b);

            /* Better code for comap
             * 
        // Sort with custom comparator
            Arrays.sort(arr, (a, b) -> {
            int factorsA = countFactors(a);
            int factorsB = countFactors(b);

            // First, compare by number of factors
            if (factorsA != factorsB) {
                return factorsA - factorsB;
            }
            // If factors are equal, compare by value
            return a - b;
        });
             */

            if(ca < cb){
                return -1;
            }else if(cb < ca){
                return 1;
            }else{

                if(a < b){
                    return -1;
                }else if(b < a){
                    return 1;
                }else{
                    return 0;
                }
            }
        });

        // Convert back to int[] if needed
        for (int i = 0; i < A.length; i++) {
            A[i] = arr[i];
        }

        return A;

    }
}
