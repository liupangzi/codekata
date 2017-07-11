import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] n1, int[] n2) {
                return n1[0] - n2[0];
            }
        });

        int max = -100001;
        for (int i = 0; i < nums.size(); i++) {
            queue.add(new int[]{nums.get(i).get(0), i, 0});
            max = Math.max(max, nums.get(i).get(0));
        }
        int min = nums.get(queue.peek()[1]).get(0), result[] = new int[]{min, max};

        while (queue.size() == nums.size()) {
            int[] tmp = queue.poll();
            if (tmp[2] + 1 == nums.get(tmp[1]).size()) break;
            queue.offer(new int[]{nums.get(tmp[1]).get(tmp[2] + 1), tmp[1], tmp[2] + 1});
            max = Math.max(max, nums.get(tmp[1]).get(tmp[2] + 1));
            min = nums.get(queue.peek()[1]).get(queue.peek()[2]);
            if (max - min < result[1] - result[0]) {
                result[0] = min;
                result[1] = max;
            }
        }
        return result;
    }
}
