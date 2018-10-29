class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            char c = name.charAt(i);
            int delta = 0;
            while (i < name.length() && name.charAt(i) == c) {
                i++;
                delta++;
            }
            while (j < typed.length() && typed.charAt(j) == c) {
                j++;
                delta--;
            }
            if (delta > 0) return false;
        }
        return i == name.length() && j == typed.length();
    }
}
