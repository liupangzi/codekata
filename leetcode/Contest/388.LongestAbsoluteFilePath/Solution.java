public class Solution {
    public static int containsNTab(String line) {
        int i = 0;
        while (line.charAt(i) == '\t') {
            i++;
        }
        return i;
    }

    public int lengthLongestPath(String input) {
        Stack<String> store = new Stack<>();
        int max_length = 0; // length counts end with file
        int tmp_length = 0; // length counts end with dir

        int current_depth = 0;
        for (String line: input.split("\\n")){
            int tmp_depth = containsNTab(line);
            String tmp_name = line.substring(tmp_depth, line.length());

            if (tmp_depth <= current_depth && !store.isEmpty()){
                for (int k = 0; k <= current_depth - tmp_depth; k++) {
                    String pop = store.pop();
                    tmp_length -= pop.length();
                    if (!pop.contains(".")) tmp_length--;
                }
            }

            store.push(tmp_name);
            tmp_length += tmp_name.length();
            if (tmp_name.contains(".")) {
                if (tmp_length > max_length) max_length = tmp_length;
            } else {
                tmp_length += 1;
            }

            current_depth = tmp_depth;
        }

        return max_length;
    }
}
