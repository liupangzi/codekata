import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCasePermutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        result.add("");
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            ArrayList<String> next = new ArrayList<>();
            if (c >= '0' && c <= '9') {
                for (String s : result) {
                    next.add(s + c);
                }
            } else if (c >= 'a' && c <= 'z') {
                for (String s : result) {
                    next.add(s + c);
                    next.add(s + (char) (c - 32));
                }
            } else {
                for (String s : result) {
                    next.add(s + c);
                    next.add(s + (char) (c + 32));
                }
            }
            result = next;
        }
        return result;
    }
}
