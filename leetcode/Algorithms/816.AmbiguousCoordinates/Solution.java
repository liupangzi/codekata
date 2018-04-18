import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> ambiguousCoordinates(String S) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 2; i < S.length() - 1; i++) {
            List<String> m = helper(S.substring(1, i)), n = helper(S.substring(i, S.length() - 1));
            for (String M : m) {
                for (String N : n) {
                    result.add("(" + M + ", " + N + ")");
                }
            }
        }
        return result;
    }

    private List<String> helper(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s.charAt(0) == '0') {
            if (s.charAt(s.length() - 1) != '0') {
                StringBuilder tmp = new StringBuilder(s);
                tmp.insert(1, '.');
                result.add(tmp.toString());
            } else {
                if (s.length() == 1) result.add(s);
            }
        } else {
            if (s.charAt(s.length() - 1) != '0') {
                for (int i = 1; i < s.length(); i++) {
                    StringBuilder tmp = new StringBuilder(s);
                    tmp.insert(i, '.');
                    result.add(tmp.toString());
                }
            }
            result.add(s);
        }
        return result;
    }
}
