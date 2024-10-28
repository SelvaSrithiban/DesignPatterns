package collection_iterators;

import java.util.Iterator;

public class BrowserHistorySortedDemo {

    public static void main(String[] args) {
        BrowserHistorySorted bh = new BrowserHistorySorted(10);
        bh.addUrl("google.com");
        bh.addUrl("google1.com");
        bh.addUrl("google2.com");
        bh.addUrl("google33.com");
        bh.addUrl("google4.com");

        //System.out.println(bh.getLastUrl());

        Iterator it = bh.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}
