package multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(100);
        /*
        ExecutorService executor1 = Executors.newCachedThreadPool();
        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        ExecutorService executor3 = Executors.newScheduledThreadPool(15);
        ExecutorService executor4 = Executors.newWorkStealingPool();
        */
		
		//executorService.submit(new NumberPrinterTask(5));
		
		for(int i = 1; i <= 100; i++) {
			executor.submit(new NumberPrinterTask(i));
		}
        //Free up the resources once all the tasks are completed
        executor.shutdown();

	}
    
}
