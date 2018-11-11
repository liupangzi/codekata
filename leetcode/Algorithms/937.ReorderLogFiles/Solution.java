import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        String[] result = new String[logs.length];
        List<String> list = new ArrayList<>();
        int end = result.length - 1;

        for (int i = logs.length - 1; i >= 0; i--) {
            char c = logs[i].charAt(logs[i].indexOf(' ') + 1);
            if (c <= '9' && c >= '0') {
                result[end--] = logs[i];
            } else {
                list.add(logs[i]);
            }
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.substring(o1.indexOf(' ') + 1).compareTo(o2.substring(o2.indexOf(' ') + 1));
            }
        });

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
