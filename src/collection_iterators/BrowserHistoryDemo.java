package collection_iterators;

import java.util.Iterator;

public class BrowserHistoryDemo {

    public static void main(String[] args) {
        
        BrowserHistory bh = new BrowserHistory(10);
        bh.addUrl("google.com");
        bh.addUrl("google1.com");
        bh.addUrl("google2.com");
        bh.addUrl("google3.com");
        bh.addUrl("google4.com");

        //System.out.println(bh.getLastUrl());

        Iterator it = bh.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
    
}
