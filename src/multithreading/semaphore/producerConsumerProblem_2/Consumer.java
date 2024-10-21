package multithreading.semaphore.producerConsumerProblem_2;

import java.util.Objects;
import java.util.Queue;

public class Consumer implements Runnable{

    Queue<Object> queue;
    int maxCap;

    Consumer(Queue queue, int maxCap){
        this.queue = queue;
        this.maxCap = maxCap;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true){
            synchronized(queue){
                if(queue.size() > 0){
                    queue.remove();
                    System.out.println("Bought a T-shirt , Size is " + queue.size());
                }
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
