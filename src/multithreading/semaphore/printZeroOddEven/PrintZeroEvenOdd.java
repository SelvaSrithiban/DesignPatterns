package multithreading.semaphore.printZeroOddEven;

import java.util.concurrent.Semaphore;

class ZeroEvenOdd {
    private int n;
    private Semaphore zeroSemaphore = new Semaphore(1);  // To control printing zero
    private Semaphore oddSemaphore = new Semaphore(0);   // To control printing odd numbers
    private Semaphore evenSemaphore = new Semaphore(0);  // To control printing even numbers

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // Method to print zeros
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            zeroSemaphore.acquire();   // Acquire permit to print zero
            printNumber.accept(0);     // Print 0
            // After printing zero, alternate between odd and even based on the index
            if (i % 2 == 1) {
                oddSemaphore.release();  // Allow odd thread to print
            } else {
                evenSemaphore.release(); // Allow even thread to print
            }
        }
    }

    // Method to print even numbers
    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            evenSemaphore.acquire();  // Wait for zero to release even thread
            printNumber.accept(i);    // Print the even number
            zeroSemaphore.release();  // Allow zero thread to print again
        }
    }

    // Method to print odd numbers
    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            oddSemaphore.acquire();   // Wait for zero to release odd thread
            printNumber.accept(i);    // Print the odd number
            zeroSemaphore.release();  // Allow zero thread to print again
        }
    }
}
