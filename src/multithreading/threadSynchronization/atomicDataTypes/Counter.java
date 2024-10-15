package multithreading.threadSynchronization.atomicDataTypes;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private AtomicInteger count;

    Counter(){
        count = new AtomicInteger(0);
    }

    int getCount(){
        return count.get();
    }

    void increment(){
        count.addAndGet(1);
    }

    void decrement(){
        count.addAndGet(-1);
    }
    
}
