import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<String>> result = new ArrayList<>();
    private List<String> tmp = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return result;
    }

    private void backtracking(String s, int index) {
        if (index == s.length()) {
            result.add(new ArrayList<>(tmp));
        } else {
            for (int i = index; i < s.length(); i++) {
                String prefix = s.substring(index, i + 1);
                if (isPalindrome(prefix)) {
                    tmp.add(prefix);
                    backtracking(s, i + 1);
                    tmp.remove(tmp.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String string) {
        int start = 0, end = string.length() - 1;
        while (start < end) {
            if (string.charAt(start++) != string.charAt(end--)) return false;
        }
        return true;
    }
}
