import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        int origin = image[sr][sc];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        while (!queue.isEmpty()) {
            int tmp[] = queue.poll(), x = tmp[0], y = tmp[1];
            if (visited[x][y]) continue;
            visited[x][y] = true;
            image[x][y] = newColor;
            if (x != 0 && !visited[x - 1][y] && image[x - 1][y] == origin) queue.add(new int[]{x - 1, y});
            if (y != 0 && !visited[x][y - 1] && image[x][y - 1] == origin) queue.add(new int[]{x, y - 1});
            if (x != image.length - 1 && !visited[x + 1][y] && image[x + 1][y] == origin)
                queue.add(new int[]{x + 1, y});
            if (y != image[0].length - 1 && !visited[x][y + 1] && image[x][y + 1] == origin)
                queue.add(new int[]{x, y + 1});
        }
        return image;
    }
}
