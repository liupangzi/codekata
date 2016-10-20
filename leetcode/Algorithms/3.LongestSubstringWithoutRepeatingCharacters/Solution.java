public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int bucket[] = new int[256];
        for (int i = 0; i < bucket.length; i++) bucket[i] = -1;

        int head = 0, result = 0;
        for(int tail = 0; tail < s.length(); tail++) {
            if(bucket[s.charAt(tail)] > -1) {
                int target = bucket[s.charAt(tail)] + 1;
                while (head < target) {
                    bucket[s.charAt(head)] = -1;
                    head++;
                }
            }

            bucket[s.charAt(tail)] = tail;
            result = (tail - head + 1) > result ? tail - head + 1 : result;
        }

        return result;
    }
}
