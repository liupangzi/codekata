import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
    private Queue<Integer> queue = new PriorityQueue<>();
    private int K;

    public KthLargest(int k, int[] nums) {
        K = k;
        for (int num : nums) add(num);
    }

    public int add(int val) {
        if (queue.size() < K) {
            queue.add(val);
        } else {
            if (queue.peek() < val) {
                queue.poll();
                queue.add(val);
            }
        }
        return queue.peek();
    }
}
