package multithreading.threadSynchronization.masterSlave;

public class MasterSlaveDemo {

    public static void main(String[] args) {
        
        Master m = new Master();
        Slave s = new Slave(m);

        Thread t1 = new Thread(()->{
            for(int i = 0; i <= 100; i++){
                m.addData("Row " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        );

        t1.start(); //master has started doing it's word.
        s.startSync();
    }
    
}
