import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> removeComments(String[] source) {
        boolean inBlock = false;
        StringBuilder tmp = new StringBuilder();

        ArrayList<String> result = new ArrayList<>();
        for (String line : source) {
            int cursor = 0;
            while (cursor < line.length()) {
                if (!inBlock && isOpenBlock(line, cursor)) {
                    inBlock = true;
                    cursor += 2;
                } else if (inBlock && isClosedBlock(line, cursor)) {
                    inBlock = false;
                    cursor += 2;
                } else if (!inBlock && isDoubleSlash(line, cursor)) {
                    break;
                } else {
                    if (!inBlock) tmp.append(line.charAt(cursor));
                    cursor++;
                }
            }

            if (!inBlock && tmp.length() > 0) {
                result.add(tmp.toString());
                tmp.setLength(0);
            }
        }
        return result;
    }

    private boolean isClosedBlock(String line, int index) {
        return (index + 1 < line.length()) && line.charAt(index) == '*' && line.charAt(index + 1) == '/';
    }

    private boolean isOpenBlock(String line, int index) {
        return (index + 1 < line.length()) && line.charAt(index) == '/' && line.charAt(index + 1) == '*';
    }

    private boolean isDoubleSlash(String line, int index) {
        return (index + 1 < line.length()) && line.charAt(index) == '/' && line.charAt(index + 1) == '/';
    }
}
