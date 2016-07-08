public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        String result = strs[0];
        int index = result.length();

        for (int i = 1; i < strs.length; i++) {
            index = index < strs[i].length() ? index : strs[i].length();
            for (int j = 0; j < index; j++) {
                if (result.charAt(j) != strs[i].charAt(j)) {
                    index = j;
                    break;
                }
            }
        }

        return result.substring(0, index);
    }
}
