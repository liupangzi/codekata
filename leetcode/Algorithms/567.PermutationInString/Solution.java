public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a[] = new int[26], sum = s1.length(), start = 0, end = 0;
        for (int i = 0; i < s1.length(); i++) a[s1.charAt(i) - 'a']--;

        while (end < s2.length()) {
            sum += a[s2.charAt(end) - 'a'] >= 0 ? 1 : -1;
            a[s2.charAt(end) - 'a']++;
            if (sum == 0) return true;
            if (end - start + 1 == s1.length()) {
                sum += a[s2.charAt(start) - 'a'] <= 0 ? 1 : -1;
                a[s2.charAt(start) - 'a']--;
                start++;
            }
            end++;
        }
        return sum == 0;
    }
}
