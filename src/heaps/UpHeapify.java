package heaps;

import java.util.ArrayList;
import java.util.List;

public class UpHeapify {

    private void swap(List<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public ArrayList<Integer> upHeapify(int[] A){
        
        //check null
        if(A == null || A.length == 0){
            return new ArrayList<>();
        }

        int n = A.length;
        ArrayList<Integer> heap = new ArrayList<>();

        //add elements into Queue
        for(int a : A){
            heap.add(a);
        }

        int i = n-1;
        //Traverse until i is positive
        while(i > 0){
            //compute the parent index
            int par = (i-1)/2;
            
            //parent is greater, swap
            if(heap.get(par) > heap.get(i)){
                swap(heap, par, i);
                //assign par to i
                i = par;
            }else{ //parent is smaller
                break;
            }
        }

        return heap;
    }

    public static void main(String[] args) {
        UpHeapify uh = new UpHeapify();
        int[] input = {5, 3, 8, 1, 2};
        ArrayList<Integer> heap = uh.upHeapify(input);
        System.out.println("Min-Heap: " + heap);
    }

}
