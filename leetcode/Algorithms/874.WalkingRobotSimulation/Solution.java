import java.util.*;

class Solution {
    private int direction = 0, x = 0, y = 0, result = 0;
    private HashSet<Long> obstacleSet = new HashSet<>();

    public int robotSim(int[] commands, int[][] obstacles) {
        for (int[] obstacle : obstacles) {
            obstacleSet.add(((long) obstacle[0] << 32) + obstacle[1]);
        }

        for (int command : commands) {
            if (command == -1) {
                direction = (direction + 1) % 4;
            } else if (command == -2) {
                direction = (direction + 3) % 4;
            } else {
                forward(command);
            }
        }
        return result;
    }

    private void forward(int n) {
        while (n-- > 0) {
            if (direction == 0) {
                y++;
                if (obstacleSet.contains(((long) x << 32) + y)) {
                    y--;
                    return;
                }
            } else if (direction == 1) {
                x++;
                if (obstacleSet.contains(((long) x << 32) + y)) {
                    x--;
                    return;
                }
            } else if (direction == 2) {
                y--;
                if (obstacleSet.contains(((long) x << 32) + y)) {
                    y++;
                    return;
                }
            } else if (direction == 3) {
                x--;
                if (obstacleSet.contains(((long) x << 32) + y)) {
                    x++;
                    return;
                }
            }
            result = Math.max(result, x * x + y * y);
        }
    }
}
