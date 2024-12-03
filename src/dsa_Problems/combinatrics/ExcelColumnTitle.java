package dsa_Problems.combinatrics;

public class ExcelColumnTitle {

    public String convertToTitle(int N) {

        String ans = "";
        //int rem = 1;
        while(N > 0){
            int rem = N % 26;

            if( rem == 0){
                ans= 'Z' + ans;
            }else{
                ans = ((char)(rem - 1 + 65)) + ans;
            }

            N = (N-1)/26;
        }


        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
