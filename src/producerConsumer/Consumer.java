package producerConsumer;

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
            if(queue.size() > 0){
                queue.remove();
                System.out.println("Bought a T-shirt , Size is " + queue.size());
            }
        }
    }
    
}
