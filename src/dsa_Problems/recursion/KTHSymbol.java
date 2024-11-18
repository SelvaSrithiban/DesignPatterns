package dsa_Problems.recursion;

import java.util.ArrayList;
import java.util.List;

public class KTHSymbol {

    public static List<Integer> solve(int n){

        //Base case
        if(n == 1){
            List<Integer> b = new ArrayList<>();
            b.add(0);
            return b;
        }

        //Assumptions
        List<Integer> prevRow = solve(n-1);
        List<Integer> ans = new ArrayList<>();

        //Traverse through the array and replace '01' for 0 and '10' for 1
        for(int i = 0; i < prevRow.size(); i++){
            if(prevRow.get(i) == 0){
                ans.add(0);
                ans.add(1);
            }else{
                ans.add(1);
                ans.add(0);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        List<Integer> ans = solve(4);
        System.out.println(ans.get(7));        
    }
    
}
