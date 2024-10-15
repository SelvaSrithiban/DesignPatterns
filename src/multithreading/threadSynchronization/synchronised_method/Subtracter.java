package multithreading.threadSynchronization.synchronised_method;

public class Subtracter implements Runnable{

    Counter counter;

    Subtracter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 0; i< 1000; i++){
            synchronized(counter){
            counter.decrement();
            }
        }
    }
    
}
