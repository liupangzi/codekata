import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0, i = 0;
        while (result < g.length && i < s.length) {
            if (g[result] <= s[i++]) result++;
        }
        return result;
    }
}
