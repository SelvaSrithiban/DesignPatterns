package multithreading.threadSynchronization.atomicDataTypes;

public class Subtracter implements Runnable{

    Counter counter;

    Subtracter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 0; i< 1000; i++){
            counter.decrement();;
        }
    }
    
}
