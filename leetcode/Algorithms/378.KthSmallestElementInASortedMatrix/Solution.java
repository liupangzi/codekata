import java.util.PriorityQueue;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Tuple> queue = new PriorityQueue<>();
        for (int j = 0; j < matrix.length; j++) queue.offer(new Tuple(0, j, matrix[0][j]));

        while (--k != 0) {
            Tuple entry = queue.poll();
            if (entry.x < matrix.length - 1) {
                queue.offer(new Tuple(entry.x + 1, entry.y, matrix[entry.x + 1][entry.y]));
            }
        }

        return queue.poll().val;
    }
}

class Tuple implements Comparable<Tuple> {
    int x, y, val;

    Tuple(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }

    @Override
    public int compareTo(Tuple that) {
        return this.val - that.val;
    }
}
