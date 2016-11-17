public class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");

        int start = 1;
        for (int i = 1; i < paths.length; i++) {
            if (paths[i].length() == 0 || paths[i].equals(".")) continue;
            if (paths[i].equals("..")) {
                if (start > 1) start--;
            } else {
                paths[start++] = paths[i];
            }
        }

        StringBuilder result = new StringBuilder();
        for (int j = 1; j < start; j++) {
            result.append("/").append(paths[j]);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
