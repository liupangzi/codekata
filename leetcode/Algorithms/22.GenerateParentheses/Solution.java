import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        helper(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void helper(ArrayList<String> result, StringBuilder tmp, int start, int end, int n) {
        if (start == n) {
            StringBuilder sb = new StringBuilder(tmp);
            for (int i = end; i < n; i++) sb.append(")");
            result.add(sb.toString());
        } else {
            StringBuilder sb1 = new StringBuilder(tmp).append("(");
            helper(result, sb1, start + 1, end, n);
            if (start > end) {
                StringBuilder sb2 = new StringBuilder(tmp).append(")");
                helper(result, sb2, start, end + 1, n);
            }
        }
    }
}
