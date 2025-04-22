package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescendingOrder {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(1);
        list.add(7);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                // TODO Auto-generated method stub
                if(a > b){
                    //a to come first
                    return -1;
                }else if(b > a){
                    //b to come first
                    return 1;
                }else{
                    return 0;
                }
            }
            
        });

        System.out.println(list);
    }
}
