package multithreading;

public class Client {

    public static void displayThreadName(){
        System.out.println("Executing display method  on the " + Thread.currentThread().getName() + " Thread");
    }

    public static void main(String[] args) {
        displayThreadName(); 
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
    
}
