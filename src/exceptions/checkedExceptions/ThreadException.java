package exceptions.checkedExceptions;

public class ThreadException {


    public static void main(String[] args) throws InterruptedException {
        
        Thread t = new Thread(()->{

        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Our thread is inrerrupted by Main");
            e.printStackTrace();
        }
    });
    t.start();
    System.out.println(Thread.currentThread().getName() + " is running");
    Thread.sleep(2000);
    System.out.println(t.getState());
    t.interrupt();
    }
    
}
