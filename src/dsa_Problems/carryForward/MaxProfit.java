package dsa_Problems.carryForward;

public class MaxProfit {

    static int optimized(int[] A){
        int profit = 0;
        int n = A.length;
        int min = A[0];
        for(int i = 1; i < n; i++){
            //Caluculate the profit
            int temp = A[i] - min;
            if(temp > profit){
                profit = temp;
            }
            //Check if the current element is mininum
            if(A[i] < min){
                min = A[i];
            }
        }
        return profit;
    }
    //SC: O(1)
    //TC: O(n)

    static int brutForce(int[] A){
        int profit = 0;
        int n = A.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = A[j] - A[i];
                if(temp > profit){
                    profit = temp;
                }
            }
        }
        return profit;
    }
    //SC: O(1)
    //TC: O(n^2)

    
    public static void main(String[] args) {

        int[] A ={6,7,5,2,6,9,3};
        //System.out.println(optimized(A));
        System.out.println(brutForce(A));
        
    }
}
