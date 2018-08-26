class Solution {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c <= 'Z' && c >= 'A') {
                result.append((char) (c + 'a' - 'A'));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
