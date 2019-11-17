class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        HashMap<Integer, ArrayList<int[]>> counter = new HashMap<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int distance = Math.abs(r0 - i) + Math.abs(c0 - j);
                ArrayList<int[]> tmp = counter.getOrDefault(distance, new ArrayList<>());
                tmp.add(new int[]{i, j});
                counter.put(distance, tmp);
            }
        }

        int k = 0, cursor = 0;
        int[][] result = new int[R * C][2];
        while (counter.containsKey(k)) {
            for (int[] v : counter.get(k)) {
                result[cursor++] = v;
            }
            k++;
        }
        return result;
    }
}