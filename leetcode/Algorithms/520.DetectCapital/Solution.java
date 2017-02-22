public class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c < 97) count++;
        }
        int result = count % word.length();

        return result == 0 || ((result == 1) && word.charAt(0) < 97);
    }
}
