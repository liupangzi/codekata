import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> set = new HashSet<>();
        for (String a : A) {
            char[] even = new char[a.length() / 2 + a.length() % 2], odd = new char[a.length() / 2];
            for (int i = 0; i < a.length(); i++) {
                if (i % 2 == 0) {
                    even[i / 2] = a.charAt(i);
                } else {
                    odd[i / 2] = a.charAt(i);
                }
            }
            Arrays.sort(even);
            Arrays.sort(odd);
            set.add(new String(even) + "|" + new String(odd));
        }
        return set.size();
    }
}
