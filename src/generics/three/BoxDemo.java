package generics.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxDemo {
    public static void main(String[] args) {

       /*Box<Integer> b1 = new Box<>(5, 10);
       Box<String> b2 = new Box<>("Hello", "World");

       Integer v1 = b1.getX();
       System.out.println(v1);

       String v2 = b2.getX();
       System.out.println(v2);*/

       BoxTwo<String, Integer> b3 = new BoxTwo<>("Hello", 10);
       System.out.println(b3);

       BoxTwo<Integer, Integer> b4 = new BoxTwo<>(5, 10);
       System.out.println(b4);

       BoxTwo<Integer, List<String>> b5 = new BoxTwo<>(5, new ArrayList<>(Arrays.asList("Apple", "Orange")));
       System.out.println(b5);






        
    }
}
