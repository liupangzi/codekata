class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustMe = new int[N + 1], iTrust = new int[N + 1];
        for (int[] pair : trust) {
            iTrust[pair[0]]++;
            trustMe[pair[1]]++;
        }

        for (int k = 1; k < trustMe.length; k++) {
            if (trustMe[k] == N - 1 && iTrust[k] == 0) return k;
        }
        return -1;
    }
}