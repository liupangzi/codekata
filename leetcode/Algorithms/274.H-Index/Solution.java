public class Solution {
    public int hIndex(int[] citations) {
        int length = citations.length, tmp[] = new int[length + 1];
        for (int citation : citations) {
            if (citation >= length) {
                tmp[length]++;
            } else {
                tmp[citation]++;
            }
        }

        int result = length;
        while (result > 0 && tmp[result] < result) {
            tmp[result - 1] += tmp[result];
            result--;
        }
        return result;
    }
}
