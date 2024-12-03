package dsa_Problems.combinatrics;

public class ExcelColumnNumber {

    public int titleToNumber(String A) {

        int ans = 0;
        int mul = 1;

        for(int i =  A.length() - 1; i >= 0; i--){

            ans += mul * (A.charAt(i) - 'A' + 1);
            mul *= 26;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
