class Solution {
    public double largestTriangleArea(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = 0; k < points.length; k++) {
                    if (k == i || k == j) continue;
                    result = Math.max(result, doubleArea(points[i], points[j], points[k]));
                }
            }
        }
        return (double) result / 2;
    }

    // https://www.mathopenref.com/coordtrianglearea.html
    private int doubleArea(int[] A, int[] B, int[] C) {
        return A[0] * B[1] - A[1] * B[0] + B[0] * C[1] - B[1] * C[0] + C[0] * A[1] - C[1] * A[0];
    }
}
