class Solution {
    public boolean checkValidString(String s) {
        int start = 0, end = 0;
        for (char c : s.toCharArray()) {
            if (start > end) return false;
            if (c == ')') {
                if (start > 0) start--;
                end--;
            } else if (c == '(') {
                start++;
                end++;
            } else {
                if (start > 0) start--;
                end++;
            }
        }
        return start <= end && start == 0;
    }
}
