package multithreading.bigFactorialCalculator;

public class Client {
    
    public static void main(String[] args) {
        
        Thread t = new Thread(new BigFactorialCalculator(50002));
        t.start();
        System.out.println("Main is doing some work");
    }
}
