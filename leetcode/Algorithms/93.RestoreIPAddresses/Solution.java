import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        helper(s, new StringBuilder(), 0, 4);
        return result;
    }

    private void helper(String s, StringBuilder tmp, int index, int count) {
        if (count + index > s.length()) return;
        if (count == 1) {
            if (s.charAt(index) == '0') {
                if (index == s.length() - 1) result.add(tmp + "0");
            } else {
                if (s.substring(index).length() < 4 && Integer.valueOf(s.substring(index)) < 256)
                    result.add(tmp + s.substring(index));
            }
        } else {
            if (s.charAt(index) == '0') {
                helper(s, new StringBuilder(tmp).append("0."), index + 1, count - 1);
            } else {
                if (index + 1 < s.length())
                    helper(s, new StringBuilder(tmp).append(s.substring(index, index + 1)).append('.'), index + 1, count - 1);
                if (index + 2 < s.length())
                    helper(s, new StringBuilder(tmp).append(s.substring(index, index + 2)).append('.'), index + 2, count - 1);
                if (index + 3 < s.length() && Integer.valueOf(s.substring(index, index + 3)) < 256)
                    helper(s, new StringBuilder(tmp).append(s.substring(index, index + 3)).append('.'), index + 3, count - 1);
            }
        }
    }
}
