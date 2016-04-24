public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2 ) return s.length();

        int bucket[] = new int[256];
        for(int i = 0; i < 256; i++){
            bucket[i] = -1;
        }

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
