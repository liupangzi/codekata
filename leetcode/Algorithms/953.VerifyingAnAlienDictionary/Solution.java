class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] orders = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orders[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            if (!isSorted(words[i - 1], words[i], orders)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(String a, String b, int[] orders) {
        int cursor = 0;
        while (cursor < Math.min(a.length(), b.length())) {
            if (orders[b.charAt(cursor) - 'a'] > orders[a.charAt(cursor) - 'a']) {
                return true;
            } else if (orders[b.charAt(cursor) - 'a'] < orders[a.charAt(cursor) - 'a']) {
                return false;
            }
            cursor++;
        }
        return a.length() == cursor;
    }
}