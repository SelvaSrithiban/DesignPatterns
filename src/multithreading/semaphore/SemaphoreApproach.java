package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreApproach {

    private static Semaphore permits = new Semaphore(3);

    public static void main(String[] args) {

        for(int i = 1; i <=5; i++){
            Thread t = new Thread(new Worker(i));
            t.start();
        }
    }

    static class Worker implements Runnable{
        
        private int workerID;

        Worker(int workerID){
            this.workerID = workerID;
        }

        @Override
        public void run() {
   
            try{
                permits.acquire();
                System.out.println("Woker " + workerID + " enters the park");
                Thread.sleep(6000);
                permits.release();
                System.out.println("Woker " + workerID + " exits the park");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
    
}
