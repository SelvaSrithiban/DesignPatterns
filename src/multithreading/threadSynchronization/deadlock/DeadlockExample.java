package multithreading.threadSynchronization.deadlock;

public class DeadlockExample {

    // Creating two locks as resources
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    // Thread 1 tries to lock lock1 and then lock2
    public void method1() {
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock 1...");

            try {
                Thread.sleep(50); // Adding a small delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 1: Waiting for lock 2...");
            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock 1 and lock 2...");
            }
        }
    }

    // Thread 2 tries to lock lock2 and then lock1
    public void method2() {
        synchronized (lock2) {
            System.out.println("Thread 2: Holding lock 2...");

            try {
                Thread.sleep(50); // Adding a small delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 2: Waiting for lock 1...");
            synchronized (lock1) {
                System.out.println("Thread 2: Holding lock 2 and lock 1...");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockExample deadlock = new DeadlockExample();

        // Creating two threads that cause a deadlock
        Thread thread1 = new Thread(deadlock::method1);
        Thread thread2 = new Thread(deadlock::method2);

        thread1.start();
        thread2.start();
    }
}

/*
 * Explanation:

	•	Thread 1 locks lock1 and tries to lock lock2.
	•	Thread 2 locks lock2 and tries to lock lock1.

Both threads are waiting for each other to release the locks, resulting in a deadlock.

This is a common synchronization issue in multithreading, 
which can be avoided using techniques like lock ordering, timeouts, or using higher-level concurrency utilities 
such as java.util.concurrent package (e.g., ReentrantLock).
 */