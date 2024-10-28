package collection_iterators;

import java.util.Iterator;
import java.util.TreeSet;

public class BrowserHistorySorted implements Iterable{

    private TreeSet<String> urls;

    BrowserHistorySorted(int length){
        urls = new TreeSet<>();
    }

    void addUrl(String url){
        urls.add(url);
    }

    String getLastUrl(){
        return urls.pollLast();
    }

    int getSize(){
        return urls.size();
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return urls.iterator();
    }

    private class ArrayIterator implements Iterator{

        String[] urls;
        int i;
        int currentSize;

        ArrayIterator(String[] urls, int currentSize){
            i = 0;
            this.urls = urls;
            this.currentSize = currentSize;
        }
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            if(i < currentSize){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            // TODO Auto-generated method stub
            return urls[i++];
            
        }
        
    }
    
}
