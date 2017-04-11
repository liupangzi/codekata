public class Solution {
    public int nextGreaterElement(int n) {
        int m = n, size = 0, peak = 1, list[] = new int[10];
        while (m != 0) {
            list[size++] = m % 10;
            m /= 10;
        }

        while (peak < size) {
            if (list[peak] < list[peak - 1]) {
                int cursor = 0, result = 0;
                while (list[cursor] <= list[peak]) cursor++;
                swap(list, cursor, peak);
                for (int i = size - 1; i >= peak; i--) result = result * 10 + list[i];
                for (int j = 0; j < peak; j++) result = result * 10 + list[j];
                if (result > n) return result;
                swap(list, cursor, peak);
            }
            peak++;
        }
        return -1;
    }

    private void swap(int[] list, int m, int n) {
        int tmp = list[m];
        list[m] = list[n];
        list[n] = tmp;
    }
}
