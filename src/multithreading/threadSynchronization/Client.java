package multithreading.threadSynchronization;

public class Client {
    
    public static void main(String[] args) throws InterruptedException {


        Counter c = new Counter();

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

        Thread adderThread = new Thread(new Adder(c));
        Thread subThread = new Thread(new Subtracter(c));

        adderThread.start();
        subThread.start();

        adderThread.join();
        subThread.join();

       
        System.out.println(c.getCount());
    }
}
