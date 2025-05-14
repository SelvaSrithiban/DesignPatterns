package heaps;

public class HeapSort {

    // Swap helper
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Down-heapify (for max-heap)
    private void downHeapify(int[] A, int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && A[left] > A[largest]) {
            largest = left;
        }

        if (right < n && A[right] > A[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(A, i, largest);
            downHeapify(A, largest, n);
        }
    }

    // Main Heap Sort method
    public void heapSort(int[] A) {
        int n = A.length;

        // Step 1: Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            downHeapify(A, i, n);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i >= 1; i--) {
            swap(A, 0, i); // Move max to end
            downHeapify(A, 0, i); // Heapify root with reduced size
        }
    }

    // Test
    public static void main(String[] args) {
        HeapSort sorter = new HeapSort();
        int[] arr = {4, 10, 3, 5, 1};

        sorter.heapSort(arr);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}
