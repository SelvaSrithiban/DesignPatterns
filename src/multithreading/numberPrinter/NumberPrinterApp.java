package multithreading.numberPrinter;

import java.util.ArrayList;
import java.util.List;

public class NumberPrinterApp {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
        Runnable r = new NumberPrinterTask(i);
        Thread t = new Thread(r);
        threads.add(t);
        }

        for(Thread t:threads){
            t.start();
        }


    }
    
}
