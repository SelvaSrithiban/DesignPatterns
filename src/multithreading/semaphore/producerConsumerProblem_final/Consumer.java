package multithreading.semaphore.producerConsumerProblem_final;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    Queue<Object> queue;
    int maxCap;
    Semaphore ps;
    Semaphore cs;
    Semaphore lock;
    private volatile boolean running = true;


    Consumer(Queue queue, int maxCap, Semaphore ps, Semaphore cs, Semaphore lock){
        this.queue = queue;
        this.maxCap = maxCap;
        this.ps = ps;
        this.cs = cs;
        this.lock = lock;
    }

    public void stop(){
        running = false;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(running){
 
            try {
                    cs.acquire();
                    lock.acquire();
                    queue.remove(); //Underflow
                    System.out.println("Bought a T-Shirt, Size " + queue.size());
                    lock.release();
                    ps.release();
                    //Thread.sleep(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
    
}
