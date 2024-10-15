package multithreading.threadSynchronization.synchronised_method;

public class Adder implements Runnable{

    Counter counter;

    Adder(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 0; i< 1000; i++){
            counter.increment();
        }
    }
    
}
