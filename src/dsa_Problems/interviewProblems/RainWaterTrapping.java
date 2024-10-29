package dsa_Problems.interviewProblems;

public class RainWaterTrapping {

    public static int rainWaterTraping(int[] A){
        int n = A.length;
        int units = 0;
        int[] pm = PrefixMax.solve(A);
        int[] sm = SuffixMax.solve(A);

        for(int i = 1; i < n-1; i++){
            //Find max of left and Max of right
            int lb = pm[i-1];
            int rb = sm[i+1];
            //Find the minimum of left max and right max
            int min = Math.min(lb,rb);
            int amt = min - A[i];
            //Summate the value to units only if amount is greater than zero
            if(amt > 0){
                units += amt;
            }
        }
        return units;
    }

    //TC : O(n)
    //SC : O(n)

    public static void main(String[] args) {

        int[] A = {4,5,2,1,3,6};
        System.out.println(rainWaterTraping(A));
        
    }
    
}
