class Solution {
    public int[] pourWater(int[] heights, int V, int K) {
        for (int i = 0; i < V; i++) {
            int left = K;
            while (left >= 0) {
                int cursor = left;
                while (cursor >= 1 && heights[cursor - 1] == heights[cursor]) cursor--;
                if (cursor == 0 || heights[cursor - 1] > heights[cursor]) break;
                left = cursor - 1;
            }

            if (left != K) {
                heights[left]++;
                continue;
            }

            int right = K;
            while (right < heights.length) {
                int cursor = right;
                while (cursor < heights.length - 1 && heights[cursor + 1] == heights[cursor]) cursor++;
                if (cursor == heights.length - 1 || heights[cursor + 1] > heights[cursor]) break;
                right = cursor + 1;
            }
            heights[right]++;
        }
        return heights;
    }
}
