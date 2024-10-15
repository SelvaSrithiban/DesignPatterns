package multithreading.threadSynchronization.mutex;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Client {
    
    public static void main(String[] args) throws InterruptedException {


        Counter c = new Counter();
        Lock lock = new ReentrantLock();

        /*
        for(int i = 0; i< 1000; i++){
            c.increment();
        }

        for(int i = 0; i< 1000; i++){
            c.decrement();
        }

         */
        /*
         * When the increment/decrement, it reads the current value from the memory and perform the updation action in
         * registry and push it back into the memory.
         */

        Thread adderThread = new Thread(new Adder(c, lock));
        Thread subThread = new Thread(new Subtracter(c, lock));

        adderThread.start();
        subThread.start();

        adderThread.join();
        subThread.join();

       
        System.out.println(c.getCount());
    }
}
