package multithreading.threadSynchronization.mutex;

public class Counter {

    int count;

    Counter(){
        count = 0;
    }

    int getCount(){
        return count;
    }

    void increment(){
        count++;
    }

    void decrement(){
        count--;
    }
    
}
