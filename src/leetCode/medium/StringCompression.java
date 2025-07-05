package leetCode.medium;

public class StringCompression {
    public int compress(char[] chars) {
        
        //check null
        if(chars == null || chars.length == 0){
            return 0;
        }

        int i = 0; //read pointer
        int idx = 0; //write pointer
        int n = chars.length;
        while(i < n){
            char curr = chars[i];
            int cnt = 0;
            //calculate the count
            while(i < n && chars[i] == curr){
                i++;
                cnt++;
            }

            //insert the char
            chars[idx++] = curr;

            //insert the value
            if(cnt > 1){
                //convert value to array
                for(char c : String.valueOf(cnt).toCharArray()){
                    chars[idx++] = c;
                }
            }
        }

        return idx;

}
}
