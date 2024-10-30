package lambdasAndStreams;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Players>{

    @Override
    public int compare(Players o1, Players o2) {
        // TODO Auto-generated method stub
        return o1.rank - o2.rank;
    }
    
}
