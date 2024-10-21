package multithreading.semaphore.producerConsumerProblem_1;

import java.util.Objects;
import java.util.Queue;

public class Producer implements Runnable{

    Queue<Object> queue;
    int maxCap;

    Producer(Queue queue, int maxCap){
        this.queue = queue;
        this.maxCap = maxCap;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //System.out.println("BEfore loop, the size " + queue.size() );
        while(true){
            if(queue.size() < maxCap){
                queue.add(new Object());
                System.out.println("Added a T-shirt , Size is " + queue.size());
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
