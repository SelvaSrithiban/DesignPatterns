package heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class EffectiveInventoryManagement {

    static final int MOD = 1_000_000_007;
    
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int n = A.size();

        // Create list of (deadline, profit) pairs
        List<int[]> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new int[]{A.get(i), B.get(i)});
        }

        // Sort by deadline
        items.sort(Comparator.comparingInt(a -> a[0]));

        // Min-heap to track profits of selected items
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int time = 0;

        for (int[] item : items) {
            int deadline = item[0];
            int profit = item[1];

            if (time < deadline) {
                // We have time to buy this item
                minHeap.add(profit);
                time++;
            } else if (!minHeap.isEmpty() && minHeap.peek() < profit) {
                // Replace the lowest profit item with a higher one
                minHeap.poll();
                minHeap.add(profit);
            }
        }

        // Sum all selected profits
        long totalProfit = 0;
        while (!minHeap.isEmpty()) {
            totalProfit = (totalProfit + minHeap.poll()) % MOD;
        }

        return (int) totalProfit;
        
    }

}
