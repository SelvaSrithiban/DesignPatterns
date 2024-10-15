package multithreading.threadSynchronization.masterSlave;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Slave {
    private List<String> slaveList;
    private ScheduledExecutorService executorService ;
    Master master;
    int lastReadIdx;

    public Slave(Master master){
        this.master = master;
        slaveList = new ArrayList<>();
        lastReadIdx = 0;
        executorService = Executors.newScheduledThreadPool(1);
    }

    public void startSync(){
        executorService.scheduleAtFixedRate(this::syncWithMaster, 0, 5, TimeUnit.SECONDS);
    }

    private void syncWithMaster(){
        List<String> updates = master.getUpdatesSinceLastSync(lastReadIdx);
        for(String u:updates){
            System.out.println("Processing Update " + u);
            slaveList.add(u);
        }
        this.lastReadIdx += updates.size();
    }

    private void stopSync(){
        executorService.shutdown();
    }
    
}
