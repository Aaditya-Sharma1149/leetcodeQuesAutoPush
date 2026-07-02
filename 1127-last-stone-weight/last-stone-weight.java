import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // Max-heap configuration
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // O(N log N) insertion (Java doesn't have native O(N) heapify for primitive arrays)
        for (int stone : stones) {
            pq.add(stone);
        }
        
        // Process stones
        while (pq.size() > 1) {
            int first = pq.poll(); 
            int sec = pq.poll();   
            
            // Only add back if there is a remainder
            if (first != sec) {
                pq.add(first - sec);
            }
        }
        
        // Handle empty heap edge case safely
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
