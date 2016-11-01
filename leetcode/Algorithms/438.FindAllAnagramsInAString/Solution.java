import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] cache = new int[26];
        for (char c : p.toCharArray()) cache[c - 'a']++;

        int left = 0, right = 0, count = p.length();
        List<Integer> result = new ArrayList<>();
        while (right < s.length()) {
            if (cache[s.charAt(right++) - 'a']-- > 0) count--;
            if (count == 0) result.add(left);
            if (right - left == p.length() && cache[s.charAt(left++) - 'a']++ >= 0) count++;
        }

        return result;
    }
}
