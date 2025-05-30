package leetCode.easy;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        //check empty string
        if(word1 == null || word2 == null){
            return null;
        }
        int n = word1.length();
        int m = word2.length();
        //create String builder of capacity n+m
        StringBuilder sb = new StringBuilder(n+m);
        //Traverse
        int i = 0;
        int j = 0;
        while((i<n)&&(j<m)){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        //if characters are left in String1
        while(i < n){
            sb.append(word1.charAt(i));
            i++;
        }
        //if characters are left in String2
        while(j < m){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
        
    }

}
