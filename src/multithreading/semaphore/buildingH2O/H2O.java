package multithreading.semaphore.buildingH2O;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class H2O{
    private Semaphore hydrogenSemaphore = new Semaphore(2);  // Limit for hydrogen threads
    private Semaphore oxygenSemaphore = new Semaphore(1);    // Limit for oxygen thread
    private CyclicBarrier barrier = new CyclicBarrier(3);   // Barrier for 3 threads (2 H and 1 O)
    public H2O() {
        
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		hydrogenSemaphore.acquire();
        
        try {
            // Wait at the barrier for two H and one O
            barrier.await();
            
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Release the hydrogen permit after bonding
            hydrogenSemaphore.release();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
        oxygenSemaphore.acquire();
        
        try {
            // Wait at the barrier for two H and one O
            barrier.await();
            
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Release the oxygen permit after bonding
            oxygenSemaphore.release();
        }
    }
}
