package leetCode.easy;

public class GCDOfStrings {
    public boolean isDivisible(String str1, String str2){

        int repeat = str1.length() / str2.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < repeat; i++){
            sb.append(str2);
        }

        return sb.toString().equals(str1);
    }
    public String gcdOfStrings(String str1, String str2) {
        
        //null or empty check
        if(str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()){
            return "";
        }

        //Indentify smaller string
        String smaller = str1.length() <= str2.length() ? str1 : str2 ;
        int n = smaller.length();

        for(int i = n; i > 0; i--){
            String subStr = smaller.substring(0,i);
            if(isDivisible(str1,subStr) && isDivisible(str2,subStr)){
                return subStr;
            }
        }

        return "";
    }

    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }

    public String gcdOfStrings1(String str1, String str2) {
        
        //null or empty check
        if(str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()){
            return "";
        }
        //Ensures both strings are built from the same repeating base
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        //find gcd of length
        int gcdLength = gcd(str1.length(),str2.length());

        return str1.substring(0, gcdLength);
        //TC : O(n+m)
        //SC: O(n+m)
    }

    
}

}
