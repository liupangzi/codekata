import java.util.HashSet;

class Solution {
    public int countCornerRectangles(int[][] grid) {
        int result = 0, height = grid.length, width = grid[0].length;
        for (int i = 0; i < width - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < height; j++) {
                if (grid[j][i] == 1) set.add(j);
            }

            for (int k = i + 1; k < width; k++) {
                int count = 0;
                for (int n : set) {
                    if (grid[n][k] == 1) count++;
                }
                result += count * (count - 1) / 2;
            }
        }
        return result;
    }
}
