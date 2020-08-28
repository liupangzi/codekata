class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int tmp = 0;
        for (int a : A) {
            if (a % 2 == 0) tmp += a;
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] % 2 == 0 && A[queries[i][1]] % 2 == 0) {
                tmp += queries[i][0];
            } else if (queries[i][0] % 2 != 0 && A[queries[i][1]] % 2 != 0) {
                tmp += queries[i][0] + A[queries[i][1]];
            } else if (queries[i][0] % 2 != 0 && A[queries[i][1]] % 2 == 0) {
                tmp -= A[queries[i][1]];
            }
            result[i] = tmp;
            A[queries[i][1]] += queries[i][0];
        }
        return result;
    }
}
