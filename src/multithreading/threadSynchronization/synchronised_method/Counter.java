package multithreading.threadSynchronization.synchronised_method;

public class Counter {

    int count;

    Counter(){
        count = 0;
    }

    int getCount(){
        return count;
    }

    synchronized void increment(){
        count++;
    }

    void decrement(){
        //Refer to the Subracter Class for block level locking and refer to the below commented method wh
        count--;
    }


    void decrementSync(){
        synchronized(this){
        count--;
        }
    }
    
}
