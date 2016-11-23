import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0) return result;

        PriorityQueue<Tuple> queue = new PriorityQueue<>();
        for (int i = 0; i < nums1.length; i++) {
            queue.offer(new Tuple(i, 0, nums1[i] + nums2[0]));
        }

        while (k-- != 0 && queue.size() > 0) {
            Tuple tuple = queue.poll();
            if (tuple.y + 1 < nums2.length)
                queue.offer(new Tuple(tuple.x, tuple.y + 1, nums1[tuple.x] + nums2[tuple.y + 1]));
            result.add(new int[]{nums1[tuple.x], nums2[tuple.y]});
        }
        return result;
    }
}

class Tuple implements Comparable<Tuple> {
    public int x, y, val;

    Tuple(int x, int y, int val) {
        this.x = x;     // index of num1
        this.y = y;     // index of num2
        this.val = val;
    }

    @Override
    public int compareTo(Tuple that) {
        return this.val - that.val;
    }
}
