package stacks;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public String solve(String A) {
    
    int len = A.length();
    Stack<Character> st = new Stack<Character>();

    //if it's a empty String
    if(len == 0){
        return "-1";
    }

    //Traverse through the String
    for(int i = 0; i < len; i++){
        char ch = A.charAt(i);
        
        if(!st.empty() && ch == st.peek()){
            //check if the peak element is same as new element then remove the peek element
            st.pop();
        }else{
            //insert into the stack
            st.push(ch);
        }
    }

    //Store the characters in a String
    int size = st.size();
    StringBuilder tmp = new StringBuilder();
    if(size <= 0){
        return "";
    }
    else{
    for(int j = 0; j < size; j++){
        char ch1 = st.peek();
        st.pop();
        tmp.append(ch1);
    }
    }
    
    return tmp.reverse().toString();
    }

}
