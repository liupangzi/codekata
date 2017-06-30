public class Solution {
    public boolean isAdditiveNumber(String num) {
        if (num == null || num.length() < 3) return false;
        int max = num.length() % 2 == 0 ? num.length() / 2 - 1 : num.length() / 2 + 1;
        for (int i = 1; i <= max; i++) {
            if (i > 1 && num.charAt(0) == '0') continue;
            for (int j = i + 1; j < num.length(); j++) {
                if (j - i > 1 && num.charAt(i) == '0') continue;
                if (helper(Long.valueOf(num.substring(0, i)), Long.valueOf(num.substring(i, j)), num, j)) return true;
            }
        }
        return false;
    }

    private boolean helper(long first, long second, String num, int cursor) {
        if (cursor == num.length()) return true;
        long nextSecond = first + second;
        String next = String.valueOf(nextSecond);
        return num.startsWith(next, cursor) && helper(second, nextSecond, num, cursor + next.length());
    }
}
