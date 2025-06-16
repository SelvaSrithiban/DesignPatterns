package leetCode.medium;

public class ReverseString {

    public String reverseWords1(String s) {
        
        //check null
        if(s == null || s.length() == 0){
            return " ";
        }

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        //remove the leading and trailing spaces
        s = s.trim();

        //remove the extra spaces
        String[] words = s.split("\\s+");

        //Append the words in Stringbuilder
        for(int i = words.length-1; i >= 0; i--){
            sb.append(words[i]);
            if(i != 0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public String reverseWords(String s) {
        
        //check null
        if(s == null || s.length() == 0){
            return " ";
        }

        //convert to Char Array
        char[] chars = s.toCharArray();
        int n = chars.length;

        //remove spaces
        int i = 0; int j= 0;
        while(j < n){
            //skip leading spaces
            while((j < n) && (chars[j] == ' ')){
                j++;
            }
            //insert the char into the array
            while((j < n) && (chars[j] != ' ')){
                chars[i] = chars[j];
                i++;
                j++;
            }
            //remove the extraspace
            while((j < n) && (chars[j] == ' ')){
                j++;
            }
            //add a space inbetween
            if((j < n)){
                chars[i] = ' ';
                i++; 
            }
        }

        int len = i;
        if(len == 0){
            return " ";
        }

        //reverse the entire char Array
       reverse(chars, 0, len-1);

       //reverse the words alone
       int start = 0;
       for(int k = 0; k <= len; k++){
            if((k == len) || chars[k] == ' '){
                reverse(chars,start,k-1);
                start = k+1;
            }
       }
    
        //return the String
        return new String(chars,0,len);

    }

    public void reverse(char[] chars, int start, int end){
        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }



}
