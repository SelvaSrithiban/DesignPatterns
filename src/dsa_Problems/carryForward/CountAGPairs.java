package dsa_Problems.carryForward;

public class CountAGPairs {

    /*
     * Constraint - 1 <= n <= 10^5
     */

    static int brutForce(String str){
        int n = str.length();
        int ans = 0;

        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'a'){
                int count = 0;
                for(int j = i+1; j < n; j++){
                    if(str.charAt(j) == 'g'){
                        count++;
                    }
                }
                ans += count;
            }
        }
        return ans;
    }
    //SC: O(1)
    //TC: O(n^2)
    

    static int optimized(String str){
        int ans = 0;
        int n = str.length();
        int count = 0;
        for(int i = n-1; i >=0; i--){
            if(str.charAt(i) == 'g'){
                count++;
            }else if(str.charAt(i) == 'a'){
                ans += count;
            }
        }
        return ans;
    }
    //SC: O(1)
    //TC: O(n)

    public static void main(String[] args) {
        String str = "abggag";
        String str1 = "ambgagkg";
        System.out.println(brutForce(str));
        System.out.println(optimized(str1));
    }
}
