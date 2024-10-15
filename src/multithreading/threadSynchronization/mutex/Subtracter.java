package multithreading.threadSynchronization.mutex;

import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{

    Counter counter;
    Lock lock;

    Subtracter(Counter counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 0; i< 1000; i++){
            lock.lock();
            counter.decrement();
            lock.unlock();
        }
    }
    
}
