package multithreading.threadSynchronization.masterSlave;

import java.util.ArrayList;
import java.util.List;

public class Master {

    private List<String> dataList;
    int lastReadIdx;

    Master(){
        dataList = new ArrayList<>();
    }
    //add data
    synchronized void addData(String data){
        System.out.println("Adding " + data + " to the Master" );
        dataList.add(data);
        
    }
    //method provides incremental fetch
    synchronized List<String> getUpdatesSinceLastSync(int lastReadIdx){
        //it reads the value from [lastReadIdx, size)
        List<String> updates = dataList.subList(lastReadIdx, dataList.size());
        //setting the lastReadIdx as size
        return updates;
    }

    
}
