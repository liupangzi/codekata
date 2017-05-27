import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    private Queue<int[]> aQueue = new LinkedList<>(), pQueue = new LinkedList<>();

    public List<int[]> pacificAtlantic(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<>();
        int height = matrix.length, length = matrix[0].length;
        boolean[][] p = new boolean[height][length], a = new boolean[height][length];

        for (int i = 0; i < height; i++) {
            p[i][0] = true;
            pQueue.add(new int[]{i, 0});
            a[height - 1 - i][length - 1] = true;
            aQueue.add(new int[]{height - 1 - i, length - 1});
        }

        for (int i = 0; i < length; i++) {
            p[0][i] = true;
            pQueue.add(new int[]{0, i});
            a[height - 1][length - 1 - i] = true;
            aQueue.add(new int[]{height - 1, length - 1 - i});
        }

        BFS(aQueue, matrix, height, length, a);
        BFS(pQueue, matrix, height, length, p);

        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (p[i][j] && a[i][j]) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result;
    }

    private void BFS(Queue<int[]> queue, int[][] matrix, int height, int length, boolean[][] result) {
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0], y = point[1];
            if (x - 1 >= 0 && !result[x - 1][y] && matrix[x - 1][y] >= matrix[x][y]) {
                result[x - 1][y] = true;
                queue.add(new int[]{x - 1, y});
            }
            if (y - 1 >= 0 && !result[x][y - 1] && matrix[x][y - 1] >= matrix[x][y]) {
                result[x][y - 1] = true;
                queue.add(new int[]{x, y - 1});
            }
            if (x + 1 < height && !result[x + 1][y] && matrix[x + 1][y] >= matrix[x][y]) {
                result[x + 1][y] = true;
                queue.add(new int[]{x + 1, y});
            }
            if (y + 1 < length && !result[x][y + 1] && matrix[x][y + 1] >= matrix[x][y]) {
                result[x][y + 1] = true;
                queue.add(new int[]{x, y + 1});
            }
        }
    }
}
