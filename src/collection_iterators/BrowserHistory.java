package collection_iterators;

import java.util.Iterator;

public class BrowserHistory implements Iterable{
    
    private String[] urls;
    private int idx;

    BrowserHistory(int length){
        urls = new String[length];
        idx = 0;
    }

    void addUrl(String url){
        urls[idx] = url;
        idx++;
    }

    String getLastUrl(){
        return urls[idx-1];
    }

    void removeUrl(){
        idx--;
    }

    int getSize(){
        return idx;
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return new ArrayIterator(urls,getSize());
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
