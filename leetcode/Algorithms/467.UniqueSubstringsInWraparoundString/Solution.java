public class Solution {
    public int findSubstringInWraproundString(String p) {
        if (p.length() == 0) return 0;

        int cache[] = new int[26], max = 1, last = p.charAt(0) - 'a';
        cache[p.charAt(0) - 'a']++;
        for (int i = 1; i < p.length(); i++) {
            int index = p.charAt(i) - 'a';
            max = (last + 1) % 26 == index ? max + 1 : 1;
            cache[index] = Math.max(cache[index], max);
            last = index;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) result += cache[i];
        return result;
    }
}
