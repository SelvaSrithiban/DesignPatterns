package multithreading.semaphore.producerConsumerProblem_final;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        final int MAX_CAP = 5;

        //Producer Semaphore with permit MAX_CAP
        Semaphore ps = new Semaphore(MAX_CAP);
        //Consumer Semaphore with permit 0
        Semaphore cs = new Semaphore(0);
        //Semphore for mutex lock
        Semaphore lock = new Semaphore(1);

        ArrayList<Producer> producers = new ArrayList<>();
        ArrayList<Consumer> consumers = new ArrayList<>();
        ArrayList<Thread> threads = new ArrayList<>(); 
        //Create multiple producer threads
        for(int i = 0; i <= 5; i++){
            Producer producer = new Producer(queue, MAX_CAP, ps, cs, lock);
            producers.add(producer);
            threads.add(new Thread(producer));
            //threads.add(new Thread(new Producer(queue, MAX_CAP, ps, cs,lock)));
        }

        //Create multiple consumer threads
        for(int i = 0; i <= 3; i++){
            Consumer consumer = new Consumer(queue, MAX_CAP, ps, cs, lock);
            consumers.add(consumer);
            threads.add(new Thread(consumer));
            //threads.add(new Thread(new Consumer(queue, MAX_CAP, ps, cs,lock)));
        }

        //Launch 10 Threads
        for(Thread t:threads){
            t.start();
        }

        try {
            Thread.sleep(5000); // Let the threads run for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

          // Stop all producer threads
        for (Producer producer : producers) {
            producer.stop();
        }

        // Stop all consumer threads
        for (Consumer consumer : consumers) {
            consumer.stop();
        }

        // Optionally, join all threads to ensure graceful shutdown
        for (Thread t : threads) {
            try {
                t.join();
                //System.out.println("Stopping the threads.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All threads stopped.");
       
    }
    
}
