package multithreading.semaphore;

public class NormalApproach {

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

            System.out.println("Woker " + workerID + " enters the park");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Woker " + workerID + " exits the park");
           
        }

        
    }
    
}
