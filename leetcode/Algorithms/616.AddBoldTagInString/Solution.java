import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String addBoldTag(String s, String[] dict) {
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < 256; i++) list.add(new ArrayList<>());
        for (String d : dict) list.get(d.charAt(0)).add(d);

        StringBuilder result = new StringBuilder();
        boolean lastBold = false, thisBold = false;
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            lastBold = thisBold;
            for (String d : list.get(s.charAt(i))) {
                if (max - i < d.length() && s.startsWith(d, i)) {
                    max = Math.max(max, i + d.length());
                }
            }
            thisBold = i < max;

            if (!lastBold && thisBold) result.append("<b>");
            if (lastBold && !thisBold) result.append("</b>");
            result.append(s.charAt(i));
        }
        if (lastBold && thisBold) result.append("</b>");
        return result.toString();
    }
}
