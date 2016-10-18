public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            result.insert(0, (char) ((n - 1) % 26 + 'A'));
            n = (n - 1) / 26;
        }
        return result.toString();
    }
}
