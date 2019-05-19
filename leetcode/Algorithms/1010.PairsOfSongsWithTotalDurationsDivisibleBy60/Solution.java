class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] counter = new int[60];
        for (int t : time) {
            counter[t % 60]++;
        }

        int result = counter[30] * (counter[30] - 1) / 2 + counter[0] * (counter[0] - 1) / 2;
        for (int i = 1; i < 30; i++) {
            result += counter[i] * counter[60 - i];
        }
        return result;
    }
}