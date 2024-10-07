package lambdasAndStreams;

public class Lambdas {

    public static void main(String[] args) {
        

        Thread t = new Thread(new Task());
        t.start();

       Runnable r = ()->{
        System.out.println("Hello World from " + Thread.currentThread().getName());
       };
       Thread t1 = new Thread(r);
       t1.start();
    }
    
}
