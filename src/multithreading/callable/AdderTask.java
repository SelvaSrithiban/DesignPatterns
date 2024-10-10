package multithreading.callable;

import java.util.concurrent.Callable;

public class AdderTask implements Callable<Integer>{

    private int a;
    private int b;

    AdderTask(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        // TODO Auto-generated method stub
        return a+b;
    }
    
}
