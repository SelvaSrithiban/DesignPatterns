package multithreading.callable;
import multithreading.bigFactorialCalculator.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AdderDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Integer> result = executor.submit(new AdderTask(5,3));
        executor.submit(new BigFactorialCalculator(57555));
        System.out.println("Main is still doing some work");

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
