import java.util.List;

public class Solution {
    public String findLongestWord(String s, List<String> d) {
        String result = "";
        for (String string : d) {
            if (isContained(string, s)) {
                if (string.length() > result.length()) {
                    result = string;
                } else if (string.length() == result.length()) {
                    if (result.compareTo(string) > 0) result = string;
                }
            }
        }
        return result;
    }

    private boolean isContained(String a, String b) {
        int index = 0, cursor = -1;
        while (index < a.length()) {
            cursor = b.indexOf(a.charAt(index), cursor + 1);
            if (cursor == -1) break;
            index++;
        }
        return index == a.length();
    }
}
