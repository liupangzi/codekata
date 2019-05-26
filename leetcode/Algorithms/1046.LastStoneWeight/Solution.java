import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(stones.length, Collections.reverseOrder());
        for (int stone : stones) {
            heap.add(stone);
        }

        while (heap.size() > 1) {
            int a = heap.poll(), b = heap.poll();
            if (a != b) {
                heap.add(a - b);
            }
        }
        return heap.size() == 0 ? 0 : heap.poll();
    }
}