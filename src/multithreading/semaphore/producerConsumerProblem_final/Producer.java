package multithreading.semaphore.producerConsumerProblem_final;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    Queue<Object> queue;
    int maxCap;
    Semaphore ps, cs, lock;
    private volatile boolean running = true;

    Producer(Queue queue, int maxCap, Semaphore ps, Semaphore cs,Semaphore lock){
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
        //System.out.println("BEfore loop, the size " + queue.size() );
        while(running){

            try {
                ps.acquire();
                    lock.acquire();
                    queue.add(new Object());
                    System.out.println("Added a T-Shirt, Size " + queue.size());
                    lock.release();
                    cs.release();
                    //Thread.sleep(300);
                } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            
        }
    }

}
