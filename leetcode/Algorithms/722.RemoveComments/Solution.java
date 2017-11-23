import java.util.ArrayList;
import java.util.List;

class Solution {
    private boolean inBlock = false;

    public List<String> removeComments(String[] source) {
        StringBuilder tmp = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();
        for (String line : source) {
            StringBuilder l = new StringBuilder(line);
            if (inBlock) {
                int end = l.indexOf("*/");
                if (end == -1) continue;
                l.delete(0, end + 2);
                inBlock = false;
            }

            tmp.append(purgeLine(l));
            if (!inBlock && tmp.length() > 0) {
                result.add(tmp.toString());
                tmp.setLength(0);
            }
        }
        return result;
    }

    private String purgeLine(StringBuilder line) {
        int start = line.indexOf("/*"), slash = line.indexOf("//");
        while (start != -1 || slash != -1) {
            if (start == -1 || (slash != -1 && slash < start)) {
                line.delete(slash, line.length());
                if (start != -1) start = line.indexOf("/*", slash + 1);
                slash = line.indexOf("//", slash + 1);
            } else if (slash == -1 || slash > start) {
                int end = line.indexOf("*/", start + 2);
                if (end == -1) break;
                line.delete(start, end + 2);
                if (slash != -1) slash = line.indexOf("//", start);
                start = line.indexOf("/*", start);
            }
        }
        inBlock = start != -1;
        return inBlock ? line.substring(0, start) : line.toString();
    }
}
