package dsa_Problems.subArrays;

public class CountGoodSubArrays {

    static int countGoodSubArrays(int[] A, int B){
        int count = 0;
        int n = A.length;

        for(int s = 0; s < n; s++){
            int sum = 0;
            for(int e = s; e < n; e++){
                sum += A[e];
                int l = e - s + 1;
                if((sum < B)&&(l % 2 == 0)){
                    count++;
                }else if((sum > B)&&(l % 2 == 1)){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {

        int[] A = {1,2,3};
        int B = 4;
        System.out.println(countGoodSubArrays(A, B));
        
    }
    
}
