package lambdasAndStreams;

public class Lambdas {

    @FunctionalInterface
    interface Addition {
        int add(int a, int b);
    }
    

    public static void main(String[] args) {

        Addition addition = (a, b) -> a + b;
        
        // Using the lambda expression
        int result = addition.add(5, 10);
        System.out.println("Sum: " + result);  // Output: Sum: 15

        Thread t = new Thread(new Task());
        t.start();

        Runnable r = ()->{
            System.out.println("Hello World from " + Thread.currentThread().getName() + " With Runnable Variable");
           };
       Thread t1 = new Thread(r);
       t1.start();

       Thread t2 = new Thread(()->{
            System.out.println("Hello world from " + Thread.currentThread().getName() + " Without Runnable variable");
       });
       t2.start();

       
    }
    
}
