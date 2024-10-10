package multithreading.callable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SorterDemo {
    public static void main(String[] args) throws Exception {
        //List<Integer> l = new ArrayList<>(List.of(7,3,1,2,4,6,17,12));
        List<Integer> l = new ArrayList<>(Arrays.asList(7, 3, 1, 2, 4, 6, 17, 12));
        ExecutorService executorService = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(l,executorService);
        Future<List<Integer>> output = executorService.submit(sorter);
        System.out.println(output.get()); //Blocking Code
        executorService.shutdown();
    }
}
