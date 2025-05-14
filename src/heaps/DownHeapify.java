package heaps;

import java.util.ArrayList;

public class DownHeapify {

    public void swap(ArrayList<Integer> heap, int i, int j){
        int tmp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, tmp);
        return;
    }

    public ArrayList<Integer> extractMinAndHeapify(int[] A) {
        ArrayList<Integer> heap = new ArrayList<>();
        for (int a : A) heap.add(a);

        int size = heap.size();

        if (size == 0) return heap;

        // Swap root with last element
        swap(heap, 0, size - 1);

        // Remove last (min) element
        heap.remove(size - 1);

        // Down-heapify from root
        downHeapify(heap, 0);

        return heap;
    }

    private void downHeapify(ArrayList<Integer> heap, int i) {
        int size = heap.size();
        while (i < size) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < size && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }

            if (right < size && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }

            if (smallest != i) {
                swap(heap, i, smallest);
                i = smallest;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        DownHeapify dh = new DownHeapify();
        int[] input = {2, 4, 5, 11, 6, 7, 8, 20, 12}; // Already a valid min-heap
        ArrayList<Integer> updatedHeap = dh.extractMinAndHeapify(input);
        System.out.println("After extracting min: " + updatedHeap);
    }
}
