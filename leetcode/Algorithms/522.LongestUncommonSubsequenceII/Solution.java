import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution {
    public int findLUSlength(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : strs) map.put(str, map.getOrDefault(str, 0) + 1);
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        int index = -1, length = -1;
        wakaka:
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() != length) {
                index = i - 1;
                length = strs[i].length();
            }

            if (map.get(strs[i]) == 1) {
                for (int j = index; j >= 0; j--) {
                    if (isSubsequence(strs[i], strs[j])) continue wakaka;
                }
                return strs[i].length();
            }
        }
        return -1;
    }

    private boolean isSubsequence(String shortString, String longString) {
        int sIndex = 0, lIndex = 0;
        while (sIndex < shortString.length() && lIndex < longString.length()) {
            if (shortString.charAt(sIndex) == longString.charAt(lIndex)) sIndex++;
            lIndex++;
        }
        return sIndex == shortString.length();
    }
}
