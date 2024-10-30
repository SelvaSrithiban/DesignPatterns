package lambdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPlayers {

    public static void main(String[] args) {
        Players p1 = new Players("Sri", 3, 25);
        Players p2 = new Players("Selva", 2, 26);
        Players p3 = new Players("Thiban", 1, 27);

        List<Players> players = new ArrayList<>(Arrays.asList(p1,p2,p3));
        System.out.println(players);
        //Using inbuilt sort
        Collections.sort(players);
        System.out.println(players);

        //USing Comparator
        Collections.sort(players, new PlayerComparator());
        System.out.println(players);

        //Using Lambda Expressions
        Collections.sort(players,(a,b)->a.age-b.age);
    }
    
}
