package dsa_Problems.recursion;

import java.util.ArrayList;
import java.util.List;

public class ValidParanthesis {

    static String[] generate(int A){

        int cb = 0;
        int ob = 0;
        int n = A;
        String paranthesis = "";
        List<String> resultList = new ArrayList<>();
        rec(n, ob, cb, paranthesis, resultList);
        
        return resultList.toArray(new String[0]);
    }

    static void rec(int n, int ob, int cb, String paranthesis, List<String> resultList){

        //base cases
        //if closing bracket > Opening bracket and Opening bracket and Closing bracket equals to n
        if(cb > ob){
            return;
        }
        if((cb == n) && (ob == n)){
            resultList.add(paranthesis);
            return;
        }

        //Valid cases
        //Opening bracket should be less than n and closing bracket should be less than opening bracket
        if(ob < n){
            rec(n, ob+1, cb, (paranthesis+ "("), resultList);
        }
        if(cb < ob){
            rec(n, ob, cb+1, (paranthesis + ")"), resultList);
        }
        
        return;
    }
    
    public static void main(String[] args) {
        int n = 3;
        String[] result = generate(n);

        for(String res:result){
            System.out.println(res);
        }
    }
}
