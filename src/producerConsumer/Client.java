package producerConsumer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Client {


    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        final int MAX_CAP = 15;

        ArrayList<Thread> threads = new ArrayList<>(); 
        //Create multiple producer threads
        for(int i = 0; i <= 5; i++){
            threads.add(new Thread(new Producer(queue, MAX_CAP)));
        }

        //Create multiple consumer threads
        for(int i = 0; i <= 3; i++){
            threads.add(new Thread(new Consumer(queue, MAX_CAP)));
        }

        //Launch 10 Threads
        for(Thread t:threads){
            t.start();
        }
    }
    
}
