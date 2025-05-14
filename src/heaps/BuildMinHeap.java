package heaps;

import java.util.ArrayList;

public class BuildMinHeap {

    // Swap helper method
    private void swap(ArrayList<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Down-heapify method
    private void downHeapify(ArrayList<Integer> heap, int i, int size) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right < size && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            swap(heap, i, smallest);
            downHeapify(heap, smallest, size);
        }
    }

    // Build min-heap from array
    public ArrayList<Integer> buildMinHeap(int[] A) {
        ArrayList<Integer> heap = new ArrayList<>();

        // Copy array to heap list
        for (int a : A) {
            heap.add(a);
        }

        int n = heap.size();

        // Apply down-heapify from last non-leaf node
        for (int i = n / 2 - 1; i >= 0; i--) {
            downHeapify(heap, i, n);
        }

        return heap;
    }

    // Test
    public static void main(String[] args) {
        BuildMinHeap builder = new BuildMinHeap();
        int[] input = {2, 4, 5, 11, 6, 7, 8, 20, 12};
        ArrayList<Integer> minHeap = builder.buildMinHeap(input);
        System.out.println("Min-Heap: " + minHeap);
    }

}
