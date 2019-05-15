import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] A) {
        int[] counter = new int[26];
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < A[0].length(); i++) {
            counter[A[0].charAt(i) - 'a']++;
            result.add(String.valueOf(A[0].charAt(i)));
        }

        for (int i = 1; i < A.length; i++) {
            int[] nextCounter = new int[26];
            ArrayList<String> nextResult = new ArrayList<>();
            for (char c : A[i].toCharArray()) {
                if (counter[c - 'a'] > 0) {
                    nextResult.add(String.valueOf(c));
                    counter[c - 'a']--;
                    nextCounter[c - 'a']++;
                }
            }
            counter = nextCounter;
            result = nextResult;
        }
        return result;
    }
}