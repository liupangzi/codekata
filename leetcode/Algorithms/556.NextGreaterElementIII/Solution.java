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
                int tmp = list[cursor];
                list[cursor] = list[peak];
                list[peak] = tmp;
                for (int i = size - 1; i >= peak; i--) result = result * 10 + list[i];
                for (int j = 0; j < peak; j++) result = result * 10 + list[j];
                return result > n ? result : -1;
            }
            peak++;
        }
        return -1;
    }
}
