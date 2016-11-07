public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0, cache[][] = new int[points.length][points.length];

        HashMap<Integer, Integer> tmp = new HashMap<>();
        for (int i = 0, L1 = points.length; i < L1; i++) {
            for (int j = 0, L2 = points.length; j < L2; j++) {
                int distance = i >= j ? cache[j][i]
                        : (points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
                        + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                if (i < j) cache[i][j] = distance;
                int last = tmp.getOrDefault(distance, 0);
                result += 2 * last;
                tmp.put(distance, last + 1);
            }
            tmp.clear();
        }

        return result;
    }
}
