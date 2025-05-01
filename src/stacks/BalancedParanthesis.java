package stacks;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {

     public int solve(String A) {

        //Create a Stack 
        Stack <Character> st = new Stack <Character> ();
        //Create a Hashmap
        HashMap <Character, Character> mp = new HashMap <Character,Character> ();
        mp.put(')', '(');  
        mp.put('}', '{');
        mp.put(']', '[');

        //Get the length of the String
        int len = A.length();

        //Check if the String size is 0
        if(len == 0){
            return 0;
        }else if(len % 2 == 1){
            //if the length is odd return flase
            return 0;
        }

        //Check if the string starts with the closing bracket
        if((A.charAt(0) == '}') || (A.charAt(0) == ']') || (A.charAt(0) == ')') ){
            return 0;
        }

        //Traverse through the entire String and check if it has corresponding closing brackets
        for(int i = 0; i < len; i++){
            char c = A.charAt(i);

            if(c == '{' || c == '[' || c == '('){
                //if it is a open bracket push into the Stack
                st.push(c);
            }else if(st.empty() || (st.peek() != mp.get(c))){
                //check if the stack is not empty and and the peak element is of the same type
                return 0;
            }else{
                //Pop the element from the Stack
                st.pop();
            }
        }

        //check if the stack is empty
        if(st.empty()){
            return 1;
        }

        return 0;
    }

}
