package heaps;

import java.util.ArrayList;

public class BuildMaxHeap {

    private void swap(ArrayList<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Down-heapify for max heap
    private void downHeapify(ArrayList<Integer> heap, int i, int size) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && heap.get(left) > heap.get(largest)) {
            largest = left;
        }

        if (right < size && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            swap(heap, i, largest);
            downHeapify(heap, largest, size);
        }
    }

    // Build max-heap from array
    public ArrayList<Integer> buildMaxHeap(int[] A) {
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
        BuildMaxHeap builder = new BuildMaxHeap();
        int[] input = {2, 4, 5, 11, 6, 7, 8, 20, 12};
        ArrayList<Integer> maxHeap = builder.buildMaxHeap(input);
        System.out.println("Max-Heap: " + maxHeap);
    }

}
