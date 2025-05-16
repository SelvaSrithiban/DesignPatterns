package heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        //Sort the list 
        List<int[]> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new int[]{A.get(i), B.get(i)});
        }

        // Sort by end time
        items.sort(Comparator.comparingInt(a -> a[1]));

       
        //add the first ending time
        int jobs = 1;
        int prevJobEndTime = items.get(0)[1];
        for(int i = 1; i < n; i++){
            //check current start > last end time
            if(items.get(i)[0] >= prevJobEndTime){
                jobs++;
                //update the last end time
                prevJobEndTime = items.get(i)[1];
            }
        }

        return jobs;
    }
}
