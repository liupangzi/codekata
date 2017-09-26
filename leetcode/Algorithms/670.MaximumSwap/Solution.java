class Solution {
    public int maximumSwap(int num) {
        char[] bucket = String.valueOf(num).toCharArray();
        for (int i = 0; i < bucket.length; i++) {
            int max = bucket[i], index = -1;

            for (int j = bucket.length - 1; j > i; j--) {
                if (bucket[j] > max) {
                    max = bucket[j];
                    index = j;
                }
            }

            if (index >= 0) {
                char c = bucket[i];
                bucket[i] = bucket[index];
                bucket[index] = c;
                return Integer.valueOf(new String(bucket));
            }
        }
        return num;
    }
}
