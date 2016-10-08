public class Solution {
    public int longestPalindrome(String s) {
        int[] bucket = new int[58];
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'A']++;
        }

        int result = 0;
        for (int v : bucket) {
            result += v >>> 1 << 1;
        }

        return s.length() > result ? result + 1 : result;
    }
}
